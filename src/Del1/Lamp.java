package Del1;

public class Lamp {
    int watt;
    private boolean isOn;

    public Lamp(int watt) {
        this.watt = watt;
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    @Override
    public String toString() {
        return "Lamp (" + watt + "W) - " + (isOn ? "ON" : "OFF");
    }

}