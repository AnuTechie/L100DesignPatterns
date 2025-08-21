package smarttraffic;

public class Main {
    public static void main(String[] args) {
        TrafficController controller = new TrafficController();

        TrafficObserver ambulance = new AmbulanceService("A1");
        TrafficObserver bus = new PublicTransport("42A");
        TrafficObserver rider = new DeliveryPartner("R-993");
        TrafficObserver app = new CitizenMobileApp("Anu");

        controller.attach(ambulance);
        controller.attach(bus);
        controller.attach(rider);
        controller.attach(app);

        // Initial broadcast
        controller.updateState("RED", "HIGH");

        // Change signal to GREEN -> all observers react
        controller.setSignalColor("GREEN");

        // Traffic eases -> observers react
        controller.setTrafficLevel("LOW");

        // Detach one observer and update again
        controller.detach(bus);
        controller.updateState("YELLOW", "MEDIUM");
    }
}
