import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;

public class Player {

    private final String playerName;
    private final Symbol symbol;
    int win;

    public Player(String playerName, Symbol symbol) {
        this.playerName = playerName;
        this.symbol = symbol;
        this.win = 0;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    Scanner scan = new Scanner(System.in);
    public Position getMove(Board board) {
       //exception:
        int positionX = -1;
        int positionY = -1;
        Scanner scanner = new Scanner(System.in);

        while (!board.isSetable(positionX, positionY)) {
            String positionXString = scanner.next();
            String positionYString = scanner.next();
            if (positionXString.equals("quit") || positionYString.equals("quit")) {
                System.out.println("GAME OVER. You left the game.");
                System.exit(0);
            }
            if (positionXString.matches("[0-9]+") && positionYString.matches("[0-9]+") ) {
                positionX = Integer.parseInt(positionXString);
                positionY = Integer.parseInt(positionYString);
            }
            else {
                System.out.println("To nie liczba");
            }
        }
        board.set(positionX, positionY, symbol.getSymbol());
        return new Position(positionX, positionY);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(playerName, player.playerName) &&
                Objects.equals(symbol, player.symbol) &&
                Objects.equals(scan, player.scan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, symbol, scan);
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                '}';
    }
}