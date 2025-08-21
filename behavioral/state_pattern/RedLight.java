public class RedLight implements TrafficLightState {
    @Override
    public void showLight() {
        System.out.println("Red Light - STOP");
    }
}
