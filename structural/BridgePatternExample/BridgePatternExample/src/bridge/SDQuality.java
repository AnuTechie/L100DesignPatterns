package bridge;

public class SDQuality implements StreamingQuality {
    @Override
    public void setQuality() {
        System.out.println("Streaming in Standard Definition (SD) quality.");
    }
}