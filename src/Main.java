public class Main {

    static Player player1 = new Player("Ania", new Symbol("|X|"));
    static Player player2 = new Player("Baryłek", new Symbol("|O|"));

    public Main() {
    }

    public static void main(String[] args) {

        Board xoBoard = new Board(4);
        Round round = new Round(1);


        while (!round.isEnd) {
            Player currentPlayer = player1;
            System.out.println(currentPlayer);
            currentPlayer.getMove(xoBoard);
            xoBoard.printBoard();
            //round.checkHorizontal(xoBoard,);
            //round.judgeScore(xoBoard);
            currentPlayer = switchPlayer(currentPlayer);
            System.out.println(currentPlayer);
            currentPlayer.getMove(xoBoard);
            xoBoard.printBoard();
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


