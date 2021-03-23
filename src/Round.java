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
    // option to declare the number of rounds:
   /* public void determineNumberOfRounds() {
        int numberOfRoundsInGame = scan.nextInt();
    }*/

    public void countMoves(Board board) {
        maxRoundMoves = (board.rows.size()) * (board.rows.get(0).size());
        moveInRound++;
    }

    public boolean noResult() {
        if (moveInRound == maxRoundMoves) {
            return true;
        }
        return false;
    }

    public void isEnd(Board board, Player player, GameOver gameOver) {
        if (roundNumber < numberOfRoundsInGame) {
            if (moveInRound == maxRoundMoves) {
                System.out.println("The round " + roundNumber + " is over. Nobody won this round.");
                moveInRound = 0;
                roundNumber++;
            }
            else {
                System.out.println("The round " + roundNumber + " is end. The winner of this round is " + player);
                moveInRound = 0;
                roundNumber++;
            }

        }
        else {
            if (moveInRound == maxRoundMoves) {
                System.out.println("The round " + roundNumber + " is over. Nobody won this round.");
                System.out.println("Game Over. The winner is ......! Congratulations!");
                return;
            }
            else {
                System.out.println("The round " + roundNumber + " is end. The winner of this round is " + player);
                System.out.println("Game Over. The winner is ......! Congratulations!");
                return;
            }
        }
    }
}








