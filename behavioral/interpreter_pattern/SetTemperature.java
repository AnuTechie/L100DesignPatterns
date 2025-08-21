public class SetTemperature implements Expression {
    private int temperature;
    public SetTemperature(int temperature) { this.temperature = temperature; }

    public void interpret() {
        System.out.println("Setting temperature to " + temperature + "°C");
    }
}
