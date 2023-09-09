package project;

public class InvalidIDException extends IllegalArgumentException {
    private String errMsg;

    public InvalidIDException(int id) {
        //
    }

    public String toString() {
        return this.getClass().getSimpleName() + " : " + this.errMsg;
    }
}
