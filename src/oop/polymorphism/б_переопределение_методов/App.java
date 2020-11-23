package oop.polymorphism.б_переопределение_методов;

public class App {

    public static void main(String[] args) {

        Ship ship = new Ship();
        ship.printAll();

        /*
        У объекта Ship в методе printAll() был использован метод move() класса Ship, а не Truck.

        Главное, не в каком классе написан метод, а какой тип (класс) объекта,
        у которого этот метод вызван.
         */
    }
}
