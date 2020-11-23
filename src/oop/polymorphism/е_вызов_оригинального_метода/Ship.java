package oop.polymorphism.е_вызов_оригинального_метода;

public class Ship extends Truck {

    public void move() {
        System.out.println("в прошлой жизни было так: ");
        super.move();
        System.out.println("А теперь: Я плыву");
    }

}
