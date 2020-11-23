package oop.inheritance.chess.abstract_chess;

public abstract class ChessItem {
    int x;
    int y;
    int worth;

    public ChessItem(int x, int y, int worth) {
        this.x = x;
        this.y = y;
        this.worth = worth;
    }

//    public abstract ChessItem() {
//    }
//
//    static abstract void sMethod() {
//
//    }

    void move() {
        System.out.println(this.getClass().getSimpleName() + " moved");
    }

    abstract void draw();
}
