public class TurnOn implements Expression {
    private String device;
    public TurnOn(String device) { this.device = device; }

    public void interpret() {
        System.out.println("Turning ON " + device);
    }
}
