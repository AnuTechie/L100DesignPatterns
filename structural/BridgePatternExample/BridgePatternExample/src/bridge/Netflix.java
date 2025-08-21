package bridge;

public class Netflix extends StreamingPlatform {

    public Netflix(StreamingQuality quality) {
        super(quality);
    }

    @Override
    public void play() {
        System.out.print("Netflix -> ");
        quality.setQuality();
    }
}