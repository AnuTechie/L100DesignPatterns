package smarttraffic;

public class PublicTransport implements TrafficObserver {
    private final String route;

    public PublicTransport(String route) {
        this.route = route;
    }

    @Override
    public void update(String signalColor, String trafficLevel) {
        String action = switch (trafficLevel) {
            case "HIGH" -> "switching to dedicated bus corridor if available.";
            case "LOW" -> "maintaining schedule.";
            default -> "adjusting ETA.";
        };
        System.out.println("[Bus " + route + "] Signal " + signalColor + ", Traffic " + trafficLevel + " -> " + action);
    }

    @Override
    public String getName() {
        return "BusRoute-" + route;
    }
}
