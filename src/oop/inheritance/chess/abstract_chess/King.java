package oop.inheritance.chess.abstract_chess;

public class King extends ChessItem {
    public King(int x, int y, int worth) {
        super(x, y, worth);
    }

    void fail() {
        System.out.println("Сдаюсь");
    }

    @Override
    void draw() {

    }
}
