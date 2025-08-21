public class Playlist {
    private Song[] songs;

    public Playlist(Song[] songs) {
        this.songs = songs;
    }

    public Iterator createIterator() {
        return new PlaylistIterator(songs);
    }
}
