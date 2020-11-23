package oop.inheritance.chess.bad_chess;

public class King {
    int x;
    int y;
    int worth;

    void move() {
        System.out.println(this.getClass().getSimpleName() + " moved");
    }

    void fail() {
        System.out.println("Сдаюсь");
    }
}
