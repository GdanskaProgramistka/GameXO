//import java.util.Scanner;

public class Round {

    int numberOfRoundsInGame;
    int roundNumber = 1;
    int moveInRound = 0;
    int maxRoundMoves;
    //Scanner scan = new Scanner(System.in);

    public Round(int numberOfRoundsInGame) {
        this.numberOfRoundsInGame = numberOfRoundsInGame;
    }

   /* public void determineNumberOfRounds() {
        int numberOfRoundsInGame = scan.nextInt();
    }*/

    public void countMoves(Board board) {
        maxRoundMoves = (board.rows.size()) * (board.column.size());
        moveInRound++;
        if (moveInRound == maxRoundMoves) {
            isEnd(board);
            moveInRound = 0;
        }
    }

    public void isEnd(Board board) {
        if (roundNumber <= numberOfRoundsInGame) {
            System.out.println("The round " + roundNumber + " is over. The winner of this round is CURRENT PLAYER");
            board.rows.clear();
            board.column.clear();
        } else {
            System.out.println("Game Over. The winner is PLAYER 1 OR 2\"");

        }
    }


}










