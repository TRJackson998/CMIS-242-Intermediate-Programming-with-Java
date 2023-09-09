package discussion3;

public class Pigeon extends Animal {

    private String featherColor;
    private String beakShape;
    private String beakColor;

    public Pigeon(String type, double weight, String speed, double height, String featherColor, String beakShape,
            String beakColor) {
        super(type, "small", weight, speed, height);
        this.featherColor = featherColor;
        this.beakShape = beakShape;
        this.beakColor = beakColor;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "featherColor='" + featherColor + '\'' +
                ", beakShape='" + beakShape + '\'' +
                ", beakColor='" + beakColor + '\'' +
                "} " + super.toString();
    }

    public void fly() {
        System.out.println("The bird flies quickly across the sky");
    }

    public void peck() {
        System.out.println("The bird pecks annoyingly at the object");
    }
}
