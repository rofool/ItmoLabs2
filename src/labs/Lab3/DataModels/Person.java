package labs.Lab3.DataModels;


import labs.Lab3.Actions.Movable;

public abstract class Person implements Movable {
    private String name;
    private State state;
    private Street street;

    public Person(String name, State state, Street street) {
        this.name = name;
        this.state = state;
        this.street = street;
    }

    @Override
    public abstract void move() throws InvalidMovementException;

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }

    public Street getStreet() {
        return street;
    }

    public void setState(State state) {
        this.state = state;
    }

    // Переопределение equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name.equals(person.name) && state == person.state && street.equals(person.street);
    }

    // Переопределение hashCode
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + street.hashCode();
        return result;
    }

    // Переопределение toString
    @Override
    public String toString() {
        return "Person{name='" + name + "', state=" + state + ", street=" + street + "}";
    }
}
