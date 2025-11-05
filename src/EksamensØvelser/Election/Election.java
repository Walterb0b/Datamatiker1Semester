package EksamensØvelser.Election;

import java.util.ArrayList;

public class Election {
    ArrayList<Candidate> candidates = new ArrayList<>();

    public void addCandidate(String name, String party, int votes){
        candidates.add(new Candidate(name, party, votes));
    }

    public int getTotalVotes(){
        int votes = 0;

        for(Candidate c : candidates){
            votes += c.getNumberOfVotes();
        }
        return votes;
    }

    public ArrayList<Candidate> getCandidatesFromParty(String party){
        ArrayList<Candidate> result = new ArrayList<>();

        for(Candidate c : candidates){
            if(c.getParty().equalsIgnoreCase(party)){
                result.add(c);
            }
        }
        return result;
    }
}


