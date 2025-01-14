package labs.Lab3.DataModels;

public class Neznaika extends Person {

    public Neznaika(State state, Street street) {
        super("Незнайка", state, street);
    }

    @Override
    public void move() {
        System.out.println("Незнайка бегает по улице.");
    }
}

