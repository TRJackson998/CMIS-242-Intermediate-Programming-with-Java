package discussion3;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;
    private String furColor;

    public Dog(String type, String size, double weight, String speed, double height, String earShape, String tailShape,
            String furColor) {
        super(type, size, weight, speed, height);
        this.earShape = earShape;
        this.tailShape = tailShape;
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                ", furColor='" + furColor + '\'' +
                "} " + super.toString();
    }

    public void bark() {
        System.out.println("The dog barks viciously");
    }

    public void run() {
        System.out.println("The dog runs speedily across");
    }
}