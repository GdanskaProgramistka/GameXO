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
        while (!board.isSetable(positionX, positionY)) {
            String positionXString = Integer.toString(positionX);
            String positionYString = Integer.toString(positionY);
            positionXString = scan.nextLine();
            positionYString = scan.nextLine();
            if (positionXString.matches("[0-9]+")) {
                continue;
            }
             else {
                if (positionXString.equals("quit")) {
                    System.out.println("Game is over");
                    break;
                } else {
                    System.out.println("It's not a number. Please enter the correct value.");
                }
            }
        }
            /*try {
                positionX = Integer.parseInt(scan.nextLine());
                positionY = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("It's not a number. Please enter the correct value.");
            }
        }*/
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