public class TrafficLight {
    private TrafficLightState state;

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void showLight() {
        state.showLight();
    }
}
