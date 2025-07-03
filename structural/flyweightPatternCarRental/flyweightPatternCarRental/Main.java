package flyweightPatternCarRental;

public class Main {
    public static void main(String[] args) {
        CarModel hondaCity = CarModelFactory.getCarModel("Honda City", "Automatic", "Petrol", 1498);
        CarModel innova = CarModelFactory.getCarModel("Toyota Innova", "Manual", "Diesel", 2393);

        Car car1 = new Car("KA01AB1234", "Red", "Bangalore", 5, hondaCity);
        Car car2 = new Car("KA02XY5678", "Black", "Mysore", 3, hondaCity);
        Car car3 = new Car("KA03ZX9999", "White", "Bangalore", 7, innova);

        car1.displayBookingInfo();
        car2.displayBookingInfo();
        car3.displayBookingInfo();
    }
}