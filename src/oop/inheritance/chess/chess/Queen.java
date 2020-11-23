package oop.inheritance.chess.chess;

public class Queen extends ChessItem {
    @Override
    void move() {
        System.out.println("Не такая как все");
    }

    void superMove() {
        // вызов метода родительского класса
        super.move();
    }
}
