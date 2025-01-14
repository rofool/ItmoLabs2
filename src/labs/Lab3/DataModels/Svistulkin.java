package labs.Lab3.DataModels;


public class Svistulkin extends Person {
    public Svistulkin(State state, Street street) {
        super("Свистулькин", state, street);
    }

    @Override
    public void move() throws InvalidMovementException {
        if (getStreet() == null) {
            throw new InvalidMovementException("Свистулькин не может двигаться по несуществующей улице.");
        }
        System.out.println("Свистулькин движется по улице " + getStreet().name());
    }

    // Переопределение equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        return getClass() == obj.getClass();
    }

    // Переопределение hashCode
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // Переопределение toString
    @Override
    public String toString() {
        return "Свистулькин: " + super.toString();
    }
}
