import java.util.Objects;
import java.util.Scanner;

public class Player {

    private final String playerName;
    private final Symbol symbol;
    Scanner scan = new Scanner(System.in);

    public Player(String playerName, Symbol symbol) {
        this.playerName = playerName;
        this.symbol = symbol;
    }

    public void getMove(Board board) {
        int position = scan.nextInt();
        while (!board.set(position, symbol.getSymbol())) {
            System.out.println("Position out of range. Please enter the correct position");
            position = scan.nextInt();
            while(!board.isEmpty(position)){
                System.out.println("This position is already taken. Chooses the empty position");
                position = scan.nextInt();
            }
        }
        board.set(position, symbol.getSymbol());
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(playerName, player.playerName) &&
                Objects.equals(symbol, player.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, symbol);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + playerName + '\'' +
                '}';
    }
}
