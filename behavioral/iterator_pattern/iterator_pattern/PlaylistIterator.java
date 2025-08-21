public class PlaylistIterator implements Iterator {
    private Song[] songs;
    private int index = 0;

    public PlaylistIterator(Song[] songs) {
        this.songs = songs;
    }

    public boolean hasNext() {
        return index < songs.length;
    }

    public Object next() {
        return songs[index++];
    }
}
