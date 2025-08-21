public class TurnOff implements Expression {
    private String device;
    public TurnOff(String device) { this.device = device; }

    public void interpret() {
        System.out.println("Turning OFF " + device);
    }
}
