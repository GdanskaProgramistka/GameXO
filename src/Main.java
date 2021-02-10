import java.sql.SQLOutput;

public class Main {

    static Player player1 = new Player("Ania", new Symbol("X"));
    static Player player2 = new Player("Baryłek", new Symbol("O"));

    public static void main(String[] args) {

        Board xoBoardLine = new Board(10);


        Player currentPlayer = player1;
        System.out.println(currentPlayer);
        currentPlayer.getMove(xoBoardLine, 4);
        currentPlayer = switchPlayer(currentPlayer);
        System.out.println(currentPlayer);
        currentPlayer.getMove(xoBoardLine, 8);
        System.out.println(xoBoardLine);
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


