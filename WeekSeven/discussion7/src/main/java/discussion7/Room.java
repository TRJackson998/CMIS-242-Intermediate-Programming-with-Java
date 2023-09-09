package discussion7;

public class Room {
    // attributes
    private int walls;
    private int windows;
    private int doors;
    private String flooring;

    // default constructor
    public Room() {
        this.walls = 4;
        this.windows = 2;
        this.doors = 1;
        this.flooring = "concrete";
    }

    // Overload: parameterized constructor
    public Room(int walls, int windows, int doors, String flooring) {
        if (walls < 2) { // can't make a room with less than 3 walls
            throw new IllegalWallNumArgumentException(walls);
        }
        this.walls = walls;
        this.windows = windows;
        this.doors = doors;
        this.flooring = flooring;
    }

    // getters
    public int getWalls() {
        return this.walls;
    }

    public int getWindows() {
        return this.windows;
    }

    public int getDoors() {
        return this.doors;
    }

    public String getFlooring() {
        return this.flooring;
    }

    /*
     * Setter
     * You can't change the number of walls, windows, doors once a room is built
     * Can only change the flooring
     */
    public void setFlooring(String flooring) {
        this.flooring = flooring;
    }

    // Overload cleanRoom
    public void cleanRoom(int minutes) {
        System.out.printf("I cleaned this room for %d minutes\n", minutes);
    }

    // Overload cleanRoom
    public void cleanRoom(String object) {
        System.out.println("I cleaned the " + object + " in this room");
    }

    // printer
    @Override
    public String toString() {
        return String.format("This room has %d walls, %d windows, %d doors, and %s flooring",
                this.getWalls(),
                this.getWindows(),
                this.getDoors(),
                this.getFlooring());
    }

}
