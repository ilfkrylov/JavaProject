package oop.inheritance.chess.abstract_chess;

public class Knight  extends ChessItem {
    public Knight(int x, int y, int worth) {
        super(x, y, worth);
    }

    @Override
    void draw() {
        System.out.println("draw King");
    }
}
