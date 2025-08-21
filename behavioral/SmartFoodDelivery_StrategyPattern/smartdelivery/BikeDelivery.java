
package smartdelivery;

public class BikeDelivery implements DeliveryStrategy {
    @Override
    public void deliver(String orderId, String location) {
        System.out.println("Order " + orderId + " is being delivered by BIKE to " + location + ".");
    }
}
