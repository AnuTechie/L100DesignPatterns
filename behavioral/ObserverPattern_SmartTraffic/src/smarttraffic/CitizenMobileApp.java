package smarttraffic;

public class CitizenMobileApp implements TrafficObserver {
    private final String user;

    public CitizenMobileApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String signalColor, String trafficLevel) {
        System.out.println("[App " + user + "] UI update -> Signal: " + signalColor + ", Traffic: " + trafficLevel);
    }

    @Override
    public String getName() {
        return "App-" + user;
    }
}
