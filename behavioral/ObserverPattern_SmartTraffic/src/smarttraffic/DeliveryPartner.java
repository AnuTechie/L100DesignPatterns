package smarttraffic;

public class DeliveryPartner implements TrafficObserver {
    private final String riderId;

    public DeliveryPartner(String riderId) {
        this.riderId = riderId;
    }

    @Override
    public void update(String signalColor, String trafficLevel) {
        if ("HIGH".equals(trafficLevel)) {
            System.out.println("[Rider " + riderId + "] Traffic HIGH -> rerouting via shorter streets.");
        } else {
            System.out.println("[Rider " + riderId + "] Traffic " + trafficLevel + " -> continuing current route.");
        }
    }

    @Override
    public String getName() {
        return "Delivery-" + riderId;
    }
}
