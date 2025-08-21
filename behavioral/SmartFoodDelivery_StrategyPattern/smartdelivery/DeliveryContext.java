
package smartdelivery;

public class DeliveryContext {
    private DeliveryStrategy strategy;

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeDelivery(String orderId, String location) {
        if(strategy == null) {
            System.out.println("No delivery strategy selected!");
            return;
        }
        strategy.deliver(orderId, location);
    }
}
