
package smartdelivery;

public interface DeliveryStrategy {
    void deliver(String orderId, String location);
}
