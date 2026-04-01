import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Skapar brädet, kollar så att brädet inte är fullt, visar brädet, låter spelaren spela, flippar brädet.
        // Och fortsätt tills brädet är fullt. Sen game over.
        Board board = new Board();
        while(!board.isFull()) {
            board.showBoard();
            board.nextTurn();
            board.mirrorBoard();
        }
        System.out.println("Game Over!");
    }
}