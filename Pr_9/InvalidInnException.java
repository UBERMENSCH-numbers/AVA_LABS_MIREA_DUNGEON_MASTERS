package Pr_9;


public class InvalidInnException extends Exception {

    public InvalidInnException() {
        super("Invalid INN.");
    }

    public InvalidInnException(String message) {
        super("Invalid INN. Message: '" + message + " '.");
    }
}
