
package smartdelivery;

public class DroneDelivery implements DeliveryStrategy {
    @Override
    public void deliver(String orderId, String location) {
        System.out.println("Order " + orderId + " is being delivered by DRONE to " + location + " (Premium Service).");
    }
}
