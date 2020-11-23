package oop.inheritance.chess.bad_chess;

public class Bishop {
    int x;
    int y;
    int worth;

    void move() {
        System.out.println(this.getClass().getSimpleName() + " moved");
    }
}
