package practice;

/**
 * 1) Model Candle object to include at minimum the following:
 * Member variables (attributes):
 * color (e.g “Blue”),
 * height (e.g. 1 inch),
 * diameter (e.g. 1.5 inch),
 * indication if lit (e.g. true or false)
 * Functionality:
 * change height;
 * light candle,
 * extinguish candle
 * New candle on creation is unlit
 */
class Candle {
    private String color;
    private double height;
    private double diameter;
    private boolean lit;

    // default constructor
    public Candle() {
        this.color = "White";
        this.height = 1.0;
        this.diameter = 1.0;
        this.lit = false;
    }

    // constructor
    public Candle(String color, double height, double diameter) {
        this.color = color;
        this.height = height;
        this.diameter = diameter;
        this.lit = false;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void lightCandle() {
        this.lit = true;
    }

    public void extinguishCandle() {
        this.lit = false;
    }

}
