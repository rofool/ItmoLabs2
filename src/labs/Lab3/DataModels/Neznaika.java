package labs.Lab3.DataModels;

public class Neznaika extends Person {

    // Конструктор для Незнайки
    public Neznaika(State state, Street street) {
        super("Незнайка", state, street); // Вызов конструктора родительского класса
    }

    // Реализация метода move()
    @Override
    public void move() {
        System.out.println("Незнайка бегает по улице.");
    }
}

