public class Main {

    public static void main(String[] args) {

        Artist artist1 = new Artist("Jay Chou");
        Artist artist2 = new Artist("Adele");

        artist1.showInfo();
        artist2.showInfo();

        Song song1 = new Song("Blue and White Porcelain", artist1, 240);
        Song song2 = new Song("Hello", artist2, 300);

        song1.showInfo();
        song2.showInfo();

        // compare multiple objects
        if (song2.isLongerThan(song1)) {
            System.out.println(song2.getTitle() + " is longer than " + song1.getTitle());
        } else {
            System.out.println(song1.getTitle() + " is longer than " + song2.getTitle());
        }

        Playlist playlist = new Playlist("My Playlist");
        playlist.addSong(song1);
        playlist.addSong(song2);

        playlist.showPlaylist();
    }
}



