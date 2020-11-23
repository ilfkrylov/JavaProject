package oop.polymorphism.д_расширение_и_сужение_типов;

public class Ship extends Truck {

    public void move() {
        System.out.println("Я плыву");
    }

    public void onlyShip() {
        System.out.println("Поднять якорь");
    }
}
