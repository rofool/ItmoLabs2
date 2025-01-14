package labs.Lab3.DataModels;

public class InvalidMovementException extends Exception {
    public InvalidMovementException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Ошибка движения: " + super.getMessage();
    }
}
