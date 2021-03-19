public class Round {

    int gameRounds;
    int roundNumber = 1;
    int moveInRound = 0;
    int maxRoundMoves;


    public Round(int gameRounds) {
        this.gameRounds = gameRounds;
    }

    public void countMoves(Board board) {
        maxRoundMoves = board.rows.size() * board.column.size();
        moveInRound++;
        if (moveInRound == maxRoundMoves) {
            System.out.println("The round " + roundNumber + " is over");
            roundNumber++;
        }
    }

    public boolean isEnd() {
        if (roundNumber <= gameRounds) {
            // board.printBoard();
            return true;
        }
        else {
            System.out.println("The winner is PlayerX");
            return false;
        }
    }
}










