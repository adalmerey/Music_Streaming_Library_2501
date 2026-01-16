import java.util.*;

public class Playlist {

    private String name;
    private ArrayList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>();
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

    // 🔍 Searching
    public Song searchByTitle(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }
        }
        return null;
    }

    // 🧹 Filtering
    public ArrayList<Song> filterByDuration(int minDuration) {
        ArrayList<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getDuration() >= minDuration) {
                result.add(song);
            }
        }
        return result;
    }

    // 🔃 Sorting
    public void sortByDuration() {
        songs.sort(Comparator.comparingInt(Song::getDuration));
    }
}
