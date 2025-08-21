package bridge;

public class YouTube extends StreamingPlatform {

    public YouTube(StreamingQuality quality) {
        super(quality);
    }

    @Override
    public void play() {
        System.out.print("YouTube -> ");
        quality.setQuality();
    }
}