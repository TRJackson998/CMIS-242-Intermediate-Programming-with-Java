package project;

public class MultipleMediaFoundException extends IllegalArgumentException {
    private String errMsg;

    public MultipleMediaFoundException(int id) {
        errMsg = "Multiple media for unique id " + id + " found!";
    }

    public String toString() {
        return this.getClass().getSimpleName() + " : " + this.errMsg;
    }
}
