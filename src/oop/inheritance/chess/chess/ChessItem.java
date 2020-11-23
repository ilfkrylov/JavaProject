package oop.inheritance.chess.chess;

public class ChessItem {
    int x;
    int y;
    int worth;

    void move() {
        System.out.println(this.getClass().getSimpleName() + " moved!");
    }
}
