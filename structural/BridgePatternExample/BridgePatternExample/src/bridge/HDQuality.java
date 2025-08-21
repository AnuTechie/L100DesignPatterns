package bridge;

public class HDQuality implements StreamingQuality {
    @Override
    public void setQuality() {
        System.out.println("Streaming in High Definition (HD) quality.");
    }
}