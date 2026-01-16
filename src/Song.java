import java.util.Objects;

public class Song extends MediaItem {

    private Artist artist;
    private int duration;

    public Song(String title, Artist artist, int duration) {
        super(title);
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void showInfo() {
        System.out.println("Song: " + name +
                ", Artist: " + artist.getName() +
                ", Duration: " + duration + " seconds");
    }

    public boolean isLongerThan(Song otherSong) {
        return this.duration > otherSong.duration;
    }

    @Override
    public String toString() {
        return "Song{title='" + name + "', artist=" + artist + ", duration=" + duration + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Song)) return false;
        Song other = (Song) obj;
        return duration == other.duration &&
                Objects.equals(name, other.name) &&
                Objects.equals(artist, other.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, artist, duration);
    }
}
