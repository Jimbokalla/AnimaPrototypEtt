import java.util.Scanner;

public class Board {

    private String[][] board;
    private Scanner input;
    private Card card;

    public Board(){
        board = new String[2][4];
        for(int k = 0; k < board.length; k++){
            for(int r = 0; r < board[k].length; r++){
                board[k][r] = "X";
            }
        }
        this.input = new Scanner(System.in);
        this.card = new Card();
    }

    public void showBoard(){
        for(int k = 0; k < board.length; k++){
            for(int r = 0;r < board[k].length; r++){
                System.out.print(board[k][r]);
            }
            System.out.println();
        }
    }


    public boolean isOccupied(int index){
        return board[1][index].equals(card.getCardSymbol());
    }

    // Detta är mest fel hantering, kollar så att det är ett nummer och är i indexen av arrayen.
    // Sedan kollar det så att där inte redan finns ett "O" där, isåfall får man göra det igen.
    public void nextTurn(){
        int index;

        while(true){
            System.out.println("Type which position you want to place your card!");

            while(!input.hasNextInt()){
                System.out.println("ERROR: Please type a number!");
                input.nextLine();
            }

            index = input.nextInt() - 1;

            if(index < 0 || index >= board[1].length){
                System.out.println("ERROR: Invalid position!");
                continue;
            }

            if(isOccupied(index)){
                System.out.println("ERROR: That position is already occupied!");
                continue;
            }

            break;
        }

        board[1][index] = card.getCardSymbol();
    }

    // Vi kollar om den är full genom att jämföra med "O":et i cardSymbol.
    public boolean isFull(){
        for(int k = 0; k < board.length; k++){
            for(int r = 0; r < board[k].length; r++){
                if(!board[k][r].equals(card.getCardSymbol())){
                    return false;
                }
            }
        }
        return true;
    }

    // Gjord för att flippa själva brädet! Tänk det som att du vänder brädan.
    public void mirrorBoard(){
            String[] temp = board[0];
            board[0] = board[1];
            board[1] = temp;
    }

}
