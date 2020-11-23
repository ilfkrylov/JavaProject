package oop.polymorphism.в_приведение_типов;

public class App {

    public static void main(String[] args) {

        Ship ship = new Ship();
        ship.getColor();

        /*
         класс при наследовании получает все методы и данные класса родителя, поэтому
         объект этого класса разрешается сохранять (присваивать) в переменные класса родителя
         */
        Truck truck = new Ship();
        truck.getColor();

        Object o = new Ship();
//        System.out.println(o.toString()); // Метод toString() унаследован от класса Object.
    }
}
