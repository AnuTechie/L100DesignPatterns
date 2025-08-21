public class Interpreter {
    public static Expression parse(String command) {
        String[] parts = command.split(" ");
        if (parts[0].equalsIgnoreCase("TURN") && parts[1].equalsIgnoreCase("ON")) {
            return new TurnOn(parts[2]);
        } else if (parts[0].equalsIgnoreCase("TURN") && parts[1].equalsIgnoreCase("OFF")) {
            return new TurnOff(parts[2]);
        } else if (parts[0].equalsIgnoreCase("SET") && parts[1].equalsIgnoreCase("TEMPERATURE")) {
            return new SetTemperature(Integer.parseInt(parts[2]));
        }
        return null;
    }
}
