package discussion6;

public class TooCold extends Temperature {
    public TooCold() {
        super("cold");
    }

    @Override
    public void adjustTemperature() {
        System.out.println("Turning the heater on!");
    }
}
