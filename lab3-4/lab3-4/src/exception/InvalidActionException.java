package exception;

public class InvalidActionException extends Exception {
    public InvalidActionException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Неверное действие: " + super.getMessage();
    }
}
