package EksamensØvelser.Song;

public class SongTest {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.add(new Song("Billie Jean", "Michael Jackson", 3.5));
        playlist.add(new Song("Smooth Criminal", "Michael Jackson", 4.2));
        playlist.add(new Song("Don't stop believing", "Journey", 5.0));
        playlist.add(new Song("Money for nothing", "Dire Straits", 8.3));

        playlist.showSongs();

        System.out.println("Total duration of songs: " + playlist.getTotalDuration() + " min");

        System.out.println(playlist.getSongFromMusician("Michael Jackson"));

        System.out.println(playlist.getSongFromMusician("Journey"));

    }
}
