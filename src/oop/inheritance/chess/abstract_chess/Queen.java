package oop.inheritance.chess.abstract_chess;

public class Queen extends ChessItem {
    public Queen(int x, int y, int worth) {
        super(x, y, worth);
    }

    @Override
    void move() {
        System.out.println("Не такая как все");
    }

    @Override
    void draw() {
        System.out.println("draw Queen");
    }
}
