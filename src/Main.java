public class Main {

    static Player player1 = new Player("Ania", new Symbol("|X|"));
    static Player player2 = new Player("Baryłek", new Symbol("|O|"));

    public Main() {
    }

    public static void main(String[] args) {


        Board xoBoard = new Board(4);
        Judge xoJudge = new Judge(xoBoard);
        Round round = new Round(3);

        Position position;
        Player currentPlayer = player1;
        while (!round.isEnd()) {
            System.out.println(currentPlayer);
            position = currentPlayer.getMove(xoBoard, round);
            xoBoard.printBoard();
            xoJudge.checkHorizontal(xoBoard, currentPlayer.getSymbol(), position);
            xoJudge.checkVertical(xoBoard, currentPlayer.getSymbol(), position);
            xoJudge.checkDiagonal1(xoBoard, currentPlayer.getSymbol(), position);
            xoJudge.checkDiagonal2(xoBoard, currentPlayer.getSymbol(), position);
            currentPlayer = switchPlayer(currentPlayer);
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


