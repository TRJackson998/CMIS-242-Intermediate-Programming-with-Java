package discussion5;

public class LivingRoom extends Room {
    private int numCouches;

    public LivingRoom(int walls, int windows, int doors, int numCouches, String flooring) {
        super(walls, windows, doors, flooring);
        this.numCouches = numCouches;
    }

    // getter
    public int getNumCouches() {
        return this.numCouches;
    }

    // setter
    public void setNumCouches(int numCouches) {
        this.numCouches = numCouches;
    }

    @Override
    public void cleanRoom(int minutes) {
        System.out.printf("I cleaned the couch(es) in this living room for %d minutes\n", minutes);
    }

    // printer
    @Override
    public String toString() {
        String outStr;
        outStr = String.format(
                "This living room has %d walls, %d windows, %d doors, ",
                this.getWalls(),
                this.getWindows(),
                this.getDoors(),
                this.getFlooring());

        int numCouches = this.getNumCouches();

        switch (numCouches) {
            case 0:
                outStr += "and has no couches";
                break;
            case 1:
                outStr += "and has 1 couch";
                break;
            default:
                outStr += String.format("and has %d couches", this.getNumCouches());
        }
        outStr += String.format(" on %s flooring\n", this.getFlooring());

        return outStr;
    }

}