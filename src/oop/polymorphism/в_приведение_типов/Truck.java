package oop.polymorphism.в_приведение_типов;

public class Truck {

    public void printAll() {
        move();
        getColor();
    }

    public void move() {
        System.out.println("Я еду");
    }

    public void getColor() {
        System.out.println("Синий");
    }
}
