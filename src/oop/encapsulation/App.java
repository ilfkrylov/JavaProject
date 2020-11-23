package oop.encapsulation;

import oop.encapsulation.model.Person;

public class App {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = null;
        person.weight = -1;

        person.setName(null);

        person.setWeight(-1);

        person.printAll();
        person.printAll();
        person.printAll();
        person.printAll();

        int w1 = person.getWeight();
        // double w2 = person.getWeightDouble();
    }
}
