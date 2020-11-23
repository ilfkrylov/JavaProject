package oop.polymorphism.а_переопределение_методов;

public class Ship extends Truck {

    public void move() {
        System.out.println("Я плыву");
    }
}

/* Так выглядит класс Ship после наследования
Ни о каком старом методе, который мы переопределили,ему не известно.

public class Ship {

    public void move() {
        System.out.println("Я плыву");
    }

    public void getColor() {
        System.out.println("Синий");
    }
}
 */
