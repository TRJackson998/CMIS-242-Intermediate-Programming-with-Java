package discussion3;

public class Fish extends Animal {
    private int numFins;
    private String scaleColor;

    public Fish(String type, String size, double weight, String speed, double height, int numFins, String scaleColor) {
        super(type, size, weight, speed, height);
        this.numFins = numFins;
        this.scaleColor = scaleColor;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "numFins='" + this.numFins + '\'' +
                ", scaleColor='" + this.scaleColor + '\'' +
                " }" + super.toString();
    }

    public void swim() {
        String speed = this.getSpeed();
        System.out.println("The fish swims " + speed + "ly!");
    }
}
