package discussion7;

public class IllegalWallNumArgumentException extends IllegalArgumentException {
    private String errMsg;

    public IllegalWallNumArgumentException(int numWalls) {
        if (numWalls < 0) {
            errMsg = "It is physically impossible for the number of walls in a room to be negative!";
        } else if (numWalls == 0) {
            errMsg = "Zero walls doesn't make a room!";
        } else if (numWalls < 3) {
            errMsg = "You need at least three walls to be able to build a room!";
        }
    }

    public String toString() {
        return this.getClass().getSimpleName() + " : " + this.errMsg;
    }
}
