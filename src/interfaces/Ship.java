package interfaces;

public class Ship extends Truck implements Swim {

    public void move() {
        System.out.println("Я плыву");
    }

    @Override
    public void swim() {
        System.out.println("Я плыву");
    }

    @Override
    public String strSwim() {
        return null;
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
