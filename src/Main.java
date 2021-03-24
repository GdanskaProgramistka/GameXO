public class Main {

    static Player player1 = new Player("Ania", new Symbol("|X|"));
    static Player player2 = new Player("Baryłek", new Symbol("|O|"));

    public Main() {
    }

    public static void main(String[] args) {

        Board xoBoard = new Board(3);
        Judge xoJudge = new Judge();
        Round round = new Round(3);
        Position position;
        GameOver xoGame = new GameOver();


        while (!xoGame.gameOver) {
            Player currentPlayer = player1;
            System.out.println(currentPlayer);
            position = currentPlayer.getMove(xoBoard);
            round.countMoves(xoBoard);
            xoBoard.printBoard();
            while (!xoJudge.checkHorizontal(xoBoard, currentPlayer.getSymbol(), position) &&
                    !xoJudge.checkVertical(xoBoard, currentPlayer.getSymbol(), position) &&
                    !xoJudge.checkDiagonal1(xoBoard, currentPlayer.getSymbol(), position) &&
                    !xoJudge.checkDiagonal2(xoBoard, currentPlayer.getSymbol(), position) &&
                    !round.noResult()) {
                currentPlayer = switchPlayer(currentPlayer);
                System.out.println(currentPlayer);
                position = currentPlayer.getMove(xoBoard);
                round.countMoves(xoBoard);
                xoBoard.printBoard();
            }
            round.isEnd(currentPlayer);
            xoBoard = new Board(xoBoard.rows.size());
        }
    }

    static Player switchPlayer(Player currentPlayer) {
        if (currentPlayer.equals(player1)) {
            currentPlayer = player2;
        }
        else {
            currentPlayer = player1;
        }
        return currentPlayer;
    }
}


