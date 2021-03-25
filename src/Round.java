import java.util.Scanner;

public class Round {

    private final int numberOfRoundsInGame;

    public Round(int numberOfRoundsInGame) {
        this.numberOfRoundsInGame = numberOfRoundsInGame;
    }

    /*public void determineNumberOfRounds() {
        System.out.println("Give a number of rounds");
        Scanner scan = new Scanner(System.in);
        int numberOfRoundsInGame = scan.nextInt();
    }*/

    private int roundNumber = 1;
    private int moveInRound = 0;
    private int maxRoundMoves;

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

    public void isEnd(Player player) {
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
                player.win++;
            }
        }
        else {
            if (moveInRound == maxRoundMoves) {
                System.out.println("The round " + roundNumber + " is over. Nobody won this round.");
                GameOver.checkWinner(player, player);
            }
            else {
                System.out.println("The round " + roundNumber + " is end. The winner of this round is " + player);
                GameOver.checkWinner(player, player);
            }
        }
    }
}








