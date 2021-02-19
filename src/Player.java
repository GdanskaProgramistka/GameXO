import java.util.Objects;
import java.util.Scanner;

public class Player {

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

    private final String playerName;
    private final Symbol symbol;
    Scanner scan = new Scanner(System.in);

    public Player(String playerName, Symbol symbol) {
        this.playerName = playerName;
        this.symbol = symbol;
    }

    public void getMove(Board board) {
        int positionX = scan.nextInt();
        int positionY = scan.nextInt();
        /*while (!board.set(positionX, positionY, symbol.getSymbol())) {
            System.out.println("Position out of range. Please enter the correct position");
            positionX = scan.nextInt();
            positionY = scan.nextInt();
        }*/
        /*while (!board.isEmpty(positionX, positionY)) {
            System.out.println("Position already taken. Please enter the new position");
            positionX = scan.nextInt();
            positionY = scan.nextInt();
        }*/

        while (!board.set(positionX, positionY, symbol.getSymbol()) || !board.isEmpty(positionX, positionY)) {
            System.out.println("wrong position");
            positionX = scan.nextInt();
            positionY = scan.nextInt();

        }
            board.set(positionX, positionY, symbol.getSymbol());
        }
    }