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

    public Symbol getSymbol() {
        return symbol;
    }

    private final Symbol symbol;
    Scanner scan = new Scanner(System.in);

    public Player(String playerName, Symbol symbol) {
        this.playerName = playerName;
        this.symbol = symbol;
    }

    public Position getMove(Board board, Round round) {
        int maxRoundMoves = board.rows.size() * board.column.size();
        int positionX = scan.nextInt();
        int positionY = scan.nextInt();
        while (!board.isSetable(positionX, positionY)) {
            positionX = scan.nextInt();
            positionY = scan.nextInt();
        }
        board.set(positionX, positionY, symbol.getSymbol());
        round.countMoves(board);
        return new Position(positionX, positionY);

    }
}