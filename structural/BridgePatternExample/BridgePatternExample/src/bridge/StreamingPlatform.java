package bridge;

public abstract class StreamingPlatform {
    protected StreamingQuality quality;

    public StreamingPlatform(StreamingQuality quality) {
        this.quality = quality;
    }

    public abstract void play();
}