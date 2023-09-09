package discussion3;

public class BedRoom extends Room {
    private int numBeds;
    private String person; // who the bedroom belongs to

    public BedRoom(int walls, int windows, int doors, int numBeds, String flooring) {
        super(walls, windows, doors, flooring);
        this.numBeds = numBeds;
        this.person = "default"; // select who the room belongs to after room is built
    }

    // getters
    public int getNumBeds() {
        return this.numBeds;
    }

    public String getPerson() {
        return this.person;
    }

    // setters
    public void setNumBeds(int numBeds) {
        if (numBeds < 0) { // there can't be a negative number of beds in a room
            numBeds = 0;
        }
        this.numBeds = numBeds;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    // printer
    @Override
    public String toString() {
        String outStr;
        outStr = String.format(
                "This bed room  belongs to %s.\n\t%s's bed room has %d walls, %d windows, %d doors, ",
                this.getPerson(),
                this.getPerson(),
                this.getWalls(),
                this.getWindows(),
                this.getDoors(),
                this.getFlooring());

        int numBeds = this.getNumBeds();

        switch (numBeds) {
            case 0:
                outStr += "and has no beds";
                break;
            case 1:
                outStr += "and has 1 bed";
                break;
            default:
                outStr += String.format("and has %d beds", this.getNumBeds());
        }
        outStr += String.format(" on %s flooring\n", this.getFlooring());

        return outStr;
    }

}
