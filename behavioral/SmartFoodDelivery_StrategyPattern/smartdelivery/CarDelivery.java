
package smartdelivery;

public class CarDelivery implements DeliveryStrategy {
    @Override
    public void deliver(String orderId, String location) {
        System.out.println("Order " + orderId + " is being delivered by CAR to " + location + ".");
    }
}
