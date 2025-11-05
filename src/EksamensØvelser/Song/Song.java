package EksamensØvelser.Song;

public class Song {
    private String name;
    private final String musician;
    private final double songDuration;

    public Song(String name, String musician, double songDuration){
        this.name = name;
        this.musician = musician;
        this.songDuration = songDuration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMusician() {
        return musician;
    }

    public String getName() {
        return name;
    }

    public double getSongDuration() {
        return songDuration;
    }

    @Override
    public String toString(){
        return "Song name: " + name + "\n" +
                "Musician: " + musician + "\n" +
                "Song duration: " + songDuration + "\n";
    }
}
