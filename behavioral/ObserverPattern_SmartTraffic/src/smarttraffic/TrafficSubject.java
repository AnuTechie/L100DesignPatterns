package smarttraffic;

public interface TrafficSubject {
    void attach(TrafficObserver observer);
    void detach(TrafficObserver observer);
    void notifyObservers();
}
