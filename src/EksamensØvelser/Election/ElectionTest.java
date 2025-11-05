package EksamensØvelser.Election;

public class ElectionTest {
    public static void main(String[] args) {
        Election election = new Election();

        election.addCandidate("Donald Trump", "Republican", 100);
        election.addCandidate("Joe Biden", "Democrats", 2);
        election.addCandidate("Mette Frederiksen", "Socialdemokratiet", 10);
        election.addCandidate("Lars Løkke", "Venstre", 10000);

        System.out.println("Total number of votes: " + election.getTotalVotes());

        System.out.println(election.getCandidatesFromParty("Socialdemokratiet"));
    }
}
