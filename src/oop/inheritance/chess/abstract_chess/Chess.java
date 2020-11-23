package oop.inheritance.chess.abstract_chess;

public class Chess {
    public static void main(String[] args) {
        King king = new King(1,5,10);
        king.draw();
        king.move();
        king.fail();


        // ChessItem chessItem = new ChessItem();
        ChessItem rook = new Rook(1,1,5);

        ChessItem[] white = new ChessItem[16];
        white[0] = rook;
        white[4] = king;
    }
}
