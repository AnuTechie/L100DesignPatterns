package smarttraffic;

public class AmbulanceService implements TrafficObserver {
    private final String name;

    public AmbulanceService(String name) {
        this.name = name;
    }

    @Override
    public void update(String signalColor, String trafficLevel) {
        if ("GREEN".equals(signalColor)) {
            System.out.println("[Ambulance " + name + "] Signal GREEN -> proceeding through intersection!");
        } else {
            System.out.println("[Ambulance " + name + "] Signal " + signalColor + " -> slowing; requesting priority route.");
        }
    }

    @Override
    public String getName() {
        return "Ambulance-" + name;
    }
}
