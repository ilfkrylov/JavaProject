package oop.polymorphism.д_расширение_и_сужение_типов;

public class Сужение {

    public static void downcastWithoutCheck() {
        // Ссылочное сужение без проверки типа объекта.
        // При этом, если в переменной truck хранился объект не класса Ship,
        // будет сгенерировано исключение – InvalidClassCastException.
        Truck truck = new Truck();
        Ship ship = (Ship) truck;
    }

    public static void downcastWithCheck() {
        // Классическое сужение типа с проверкой
        Truck truck = new Ship();
        if (truck instanceof Ship) {
            Ship ship = (Ship) truck;
        }
    }
}
