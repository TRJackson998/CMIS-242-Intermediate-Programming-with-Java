package discussion6;

public class Temperature {
    private String feelsLike = "neutral";

    public Temperature() {
        this.feelsLike = "neutral";
    }

    public Temperature(String feelsLike) {
        this.feelsLike = feelsLike;
    }

    public String getTemperature() {
        return this.feelsLike;
    }

    public void adjustTemperature() {
        System.out.println("The temperature does not need to be adjusted!");
    }
}
