package flyweightPatternCarRental;

public class Car {
    private final String registrationNumber;
    private final String color;
    private final String location;
    private final int durationDays;
    private final CarModel model;

    public Car(String registrationNumber, String color, String location, int durationDays, CarModel model) {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.location = location;
        this.durationDays = durationDays;
        this.model = model;
    }

    public void displayBookingInfo() {
        model.display(registrationNumber, color, location, durationDays);
    }
}