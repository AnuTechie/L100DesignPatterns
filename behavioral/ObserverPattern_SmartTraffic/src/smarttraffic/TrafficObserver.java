package smarttraffic;

public interface TrafficObserver {
    void update(String signalColor, String trafficLevel);
    String getName();
}
