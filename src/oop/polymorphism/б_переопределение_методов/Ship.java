package oop.polymorphism.б_переопределение_методов;

public class Ship extends Truck {

    public void move() {
        System.out.println("Я плыву");
    }
}

/* Так выглядит класс Ship после наследования и переопределения

public class Ship {

    public void printAll() {
        move();
        getColor();
    }

    public void move() {
        System.out.println("Я плыву");
    }

    public void getColor() {
        System.out.println("Синий");
    }
}

 */
