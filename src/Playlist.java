import java.util.ArrayList;

public class Playlist {

    private String name;
    private ArrayList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void showPlaylist() {
        System.out.println("Playlist: " + name);
        for (Song song : songs) {
            song.showInfo();
        }
    }
}

