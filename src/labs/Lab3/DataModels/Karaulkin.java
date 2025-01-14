package labs.Lab3.DataModels;

public class Karaulkin extends Person {

    // Конструктор для Караулькина
    public Karaulkin(State state, Street street) {
        super("Караулькин", state, street); // Вызов конструктора родительского класса
    }

    // Реализация метода move()
    @Override
    public void move() {
        System.out.println("Караулькин ожидает Свистулькина в милиции.");
    }
}
