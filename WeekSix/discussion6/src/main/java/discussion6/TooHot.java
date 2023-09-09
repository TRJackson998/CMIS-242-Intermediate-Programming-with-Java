package discussion6;

public class TooHot extends Temperature {
    public TooHot() {
        super("hot");
    }

    @Override
    public void adjustTemperature() {
        System.out.println("Turning the fan on!");
    }    
}