import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        Initialization.declarePlayers();
        Board xoBoard = new Board(Initialization.boardGetSize());
        Round round = new Round(Initialization.getNumberOfRounds());
        Judge xoJudge = new Judge();
        Position position;


        while (!GameOver.gameOver) {
            Player currentPlayer = Players.createdPlayersList.get(0);
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
        int i = Players.createdPlayersList.indexOf(currentPlayer);
        if (currentPlayer.equals(Players.createdPlayersList.get(i))) {
            if (i == Players.createdPlayersList.size() - 1){
                currentPlayer = Players.createdPlayersList.get(0);
            }
            else {
                currentPlayer = Players.createdPlayersList.get(i + 1);
            }
        }
        return currentPlayer;
    }
}


