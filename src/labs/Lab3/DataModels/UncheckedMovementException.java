package labs.Lab3.DataModels;

public class UncheckedMovementException extends RuntimeException {
    public UncheckedMovementException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Непредвиденная ошибка движения: " + super.getMessage();
    }
}
