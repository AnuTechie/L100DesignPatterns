
package smartdelivery;

public class SmartFoodDeliveryApp {
    public static void main(String[] args) {
        DeliveryContext context = new DeliveryContext();

        // Order 1 → Short distance → Bike delivery
        context.setStrategy(new BikeDelivery());
        context.executeDelivery("ORD123", "MG Road");

        // Order 2 → Medium distance → Car delivery
        context.setStrategy(new CarDelivery());
        context.executeDelivery("ORD456", "Whitefield");

        // Order 3 → Premium service → Drone delivery
        context.setStrategy(new DroneDelivery());
        context.executeDelivery("ORD789", "Electronic City");
    }
}
