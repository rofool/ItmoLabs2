package labs.Lab3.Main;

import labs.Lab3.DataModels.*;

import java.util.ArrayList;

public class MainEvent {
    public static void main(String[] args) {
        Street macaroniStreet = new Street("Макаронная улица", "центр города");
        Street hospitalStreet = new Street("Улица больницы", "на окраине");

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Svistulkin(State.HEALTHY, macaroniStreet));
        people.add(new Karaulkin(State.CONFUSED, hospitalStreet));

        for (Person person : people) {
            try {
                person.move();
                System.out.println(person.getName() + " на улице " + person.getStreet().name());
                System.out.println(person.getName() + " в состоянии " + person.getState());
            } catch (InvalidMovementException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}


