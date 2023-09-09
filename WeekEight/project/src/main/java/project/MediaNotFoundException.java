package project;

public class MediaNotFoundException extends IllegalArgumentException {
    private String errMsg;

    public MediaNotFoundException(int id) {
        errMsg = "Media for id " + id + " not found!";
    }

    public MediaNotFoundException(String title) {
        errMsg = "Media for title " + title + " not found!";
    }

    public String toString() {
        return this.getClass().getSimpleName() + " : " + this.errMsg;
    }
}
