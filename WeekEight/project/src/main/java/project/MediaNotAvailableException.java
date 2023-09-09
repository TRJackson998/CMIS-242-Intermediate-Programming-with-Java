package project;

public class MediaNotAvailableException extends IllegalArgumentException {
    private String errMsg;

    public MediaNotAvailableException(int id) {
        errMsg = "Media " + id + " is not available to check out!";
    }

    public String toString() {
        return this.getClass().getSimpleName() + " : " + this.errMsg;
    }
}
