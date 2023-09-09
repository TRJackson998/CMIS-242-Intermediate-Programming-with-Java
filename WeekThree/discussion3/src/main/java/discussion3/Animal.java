package discussion3;

public class Animal {
    private String type;
    private String size;
    private double weight;
    private String speed;
    private double height;

    public Animal(String type, String size, double weight, String speed, double height) {
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.speed = speed;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                ", speed='" + speed + '\'' +
                ", height=" + height +
                '}';
    }

    public String getSpeed() {
        return this.speed;
    }

    public void buildShelter() {
        System.out.println(type + " " + speed + "ly sets out to find materials to build a shelter...");
        System.out.println(type + " " + speed + "ly gathers materials...");
        System.out.println(type + " " + speed + "ly hauls material back to a suitable location...");
        System.out.println(type + " " + speed + "ly starts building the shelter...");
    }

    public void findFood() {
        System.out.println(type + " " + speed + "ly sets out to find food...");
        System.out.println(type + " stumbles upon a food source...");
        System.out.println(type + " " + speed + "ly consumes the food and heads on its way...");
    }
}
