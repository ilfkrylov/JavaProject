package oop.polymorphism.е_вызов_оригинального_метода;

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
