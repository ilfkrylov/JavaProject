package oop.inheritance.chess.chess;

public class Chess {
    public static void main(String[] args) {
        King king = new King();
        king.move();
        king.fail();

        ChessItem queen = new Queen();

        ChessItem chessIte = new ChessItem();
    }
}
