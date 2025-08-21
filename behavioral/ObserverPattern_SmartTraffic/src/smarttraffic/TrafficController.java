package smarttraffic;

import java.util.ArrayList;
import java.util.List;

public class TrafficController implements TrafficSubject {
    private final List<TrafficObserver> observers = new ArrayList<>();
    private String signalColor = "RED";      // RED, YELLOW, GREEN
    private String trafficLevel = "MEDIUM";  // LOW, MEDIUM, HIGH

    @Override
    public void attach(TrafficObserver observer) {
        observers.add(observer);
        System.out.println("[Controller] Attached: " + observer.getName());
    }

    @Override
    public void detach(TrafficObserver observer) {
        observers.remove(observer);
        System.out.println("[Controller] Detached: " + observer.getName());
    }

    @Override
    public void notifyObservers() {
        for (TrafficObserver obs : observers) {
            obs.update(signalColor, trafficLevel);
        }
    }

    public void setSignalColor(String color) {
        if (!color.equalsIgnoreCase(this.signalColor)) {
            this.signalColor = color.toUpperCase();
            System.out.println("\n[Controller] Signal changed to: " + this.signalColor);
            notifyObservers();
        }
    }

    public void setTrafficLevel(String level) {
        if (!level.equalsIgnoreCase(this.trafficLevel)) {
            this.trafficLevel = level.toUpperCase();
            System.out.println("\n[Controller] Traffic level changed to: " + this.trafficLevel);
            notifyObservers();
        }
    }

    // Convenience combined update
    public void updateState(String color, String level) {
        this.signalColor = color.toUpperCase();
        this.trafficLevel = level.toUpperCase();
        System.out.println("\n[Controller] State -> Signal: " + this.signalColor + ", Traffic: " + this.trafficLevel);
        notifyObservers();
    }
}
