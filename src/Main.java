import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        while(!board.isFull()) {
            board.showBoard();
            board.nextTurn();
            board.mirrorBoard();
        }
        System.out.println("Game Over!");
    }
}