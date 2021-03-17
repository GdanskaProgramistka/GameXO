public class Main {

    static Player player1 = new Player("Ania", new Symbol("|X|"));
    static Player player2 = new Player("Baryłek", new Symbol("|O|"));

    public Main() {
    }

    public static void main(String[] args) {


        Board xoBoard = new Board(8);
        Round round = new Round(1);


        while (!round.isEnd) {
            Player currentPlayer = player1;
            System.out.println(currentPlayer);
            Position position = currentPlayer.getMove(xoBoard);
            xoBoard.printBoard();
            round.checkHorizontal(xoBoard, currentPlayer.getSymbol(), position);
            round.checkVertical(xoBoard, currentPlayer.getSymbol(), position);
            round.checkDiagonal1(xoBoard, currentPlayer.getSymbol(), position);
            round.checkDiagonal2(xoBoard, currentPlayer.getSymbol(), position);

            currentPlayer = switchPlayer(currentPlayer);
            System.out.println(currentPlayer);
            currentPlayer.getMove(xoBoard);
            xoBoard.printBoard();
            round.checkHorizontal(xoBoard, currentPlayer.getSymbol(), position);
            round.checkVertical(xoBoard, currentPlayer.getSymbol(), position);
            round.checkDiagonal1(xoBoard, currentPlayer.getSymbol(), position);
            //currentPlayer = switchPlayer(currentPlayer);
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


