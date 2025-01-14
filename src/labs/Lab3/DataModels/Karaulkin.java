package labs.Lab3.DataModels;

public class Karaulkin extends Person {

    public Karaulkin(State state, Street street) {
        super("Караулькин", state, street);
    }

    @Override
    public void move() {
        System.out.println("Караулькин ожидает Свистулькина в милиции.");
    }
}
