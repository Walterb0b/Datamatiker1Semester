package EksamensØvelser.Song;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> playlist;

    public Playlist(){
        this.playlist = new ArrayList<>();
    }

    public void add(Song song){
        playlist.add(song);
    }

    public void showSongs(){
        for (Song s : playlist){
            System.out.println(s);
        }
    }

    public double getTotalDuration(){
        double totalDuration = 0;
        for(Song s : playlist){
            totalDuration += s.getSongDuration();
        }
        return totalDuration;
    }

    public ArrayList<String> getSongFromMusician(String musician){
        ArrayList<String> songs = new ArrayList<>();
        for(Song s : playlist){
            if(s.getMusician().equalsIgnoreCase(musician))
                songs.add(s.getName());
        }
        return songs;
    }


}
