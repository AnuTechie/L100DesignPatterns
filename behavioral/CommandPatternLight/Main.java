public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new TurnOnLightCommand(light);
        Command lightOff = new TurnOffLightCommand(light);
        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);
        remote.pressButton();
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}