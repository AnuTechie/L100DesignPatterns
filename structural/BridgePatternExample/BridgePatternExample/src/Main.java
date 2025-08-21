import bridge.*;

public class Main {
    public static void main(String[] args) {
        StreamingPlatform netflixHD = new Netflix(new HDQuality());
        StreamingPlatform netflixSD = new Netflix(new SDQuality());
        StreamingPlatform youtubeHD = new YouTube(new HDQuality());
        StreamingPlatform youtubeSD = new YouTube(new SDQuality());

        netflixHD.play();
        netflixSD.play();
        youtubeHD.play();
        youtubeSD.play();
    }
}