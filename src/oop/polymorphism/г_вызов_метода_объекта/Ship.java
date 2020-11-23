package oop.polymorphism.г_вызов_метода_объекта;

public class Ship extends Truck {

    public void move() {
        System.out.println("Я плыву");
    }

    public void onlyShip() {
        System.out.println("Поднять якорь");
    }
}
