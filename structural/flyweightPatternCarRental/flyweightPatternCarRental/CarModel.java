package flyweightPatternCarRental;

public class CarModel {
    private final String modelName;
    private final String transmission;
    private final String fuelType;
    private final int engineCC;

    public CarModel(String modelName, String transmission, String fuelType, int engineCC) {
        this.modelName = modelName;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.engineCC = engineCC;
    }

    public void display(String registrationNumber, String color, String location, int durationDays) {
        System.out.println("Booking Details:");
        System.out.println("Model: " + modelName + " | " + transmission + " | " + fuelType + " | " + engineCC + "cc");
        System.out.println("Reg No: " + registrationNumber + ", Color: " + color);
        System.out.println("Location: " + location + ", Duration: " + durationDays + " days");
        System.out.println("---------------------------------------------------");
    }
}