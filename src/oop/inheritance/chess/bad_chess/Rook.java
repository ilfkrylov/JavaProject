package oop.inheritance.chess.bad_chess;

public class Rook {
    int x;
    int y;
    int worth;

    void move() {
        System.out.println(this.getClass().getSimpleName() + " moved");
    }
}
