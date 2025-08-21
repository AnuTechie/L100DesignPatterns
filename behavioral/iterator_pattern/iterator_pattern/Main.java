public class Main {
    public static void main(String[] args) {
        Song[] songs = {
            new Song("Song A"), new Song("Song B"), new Song("Song C")
        };

        Playlist playlist = new Playlist(songs);
        Iterator it = playlist.createIterator();

        while (it.hasNext()) {
            Song s = (Song) it.next();
            System.out.println("Playing: " + s.getTitle());
        }
    }
}
