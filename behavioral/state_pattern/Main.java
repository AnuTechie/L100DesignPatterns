public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.setState(new RedLight());
        trafficLight.showLight();

        trafficLight.setState(new GreenLight());
        trafficLight.showLight();

        trafficLight.setState(new YellowLight());
        trafficLight.showLight();
    }
}
