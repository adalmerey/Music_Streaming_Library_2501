public class Song {

    private String title;
    private Artist artist;
    private int duration; // seconds

    public Song(String title, Artist artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public void showInfo() {
        System.out.println(
                "Song: " + title +
                        ", Artist: " + artist.getName() +
                        ", Duration: " + duration + " seconds"
        );
    }

    // compare multiple objects
    public boolean isLongerThan(Song otherSong) {
        return this.duration > otherSong.duration;
    }
}
