import java.util.Scanner;

public class Main {


    static Player player1 = new Player(Initialization.playerGetName(), new Symbol("|X|"));
    static Player player2 = new Player(Initialization.playerGetName(), new Symbol("|O|"));

    public Main() {
    }

    public static void main(String[] args) {

        Board xoBoard = new Board(Initialization.boardGetSize());
        Judge xoJudge = new Judge();
        Scanner scan = new Scanner(System.in);
        Round round = new Round(Initialization.gameGetNumberOfRounds());
        Position position;


        while (!GameOver.gameOver) {
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


