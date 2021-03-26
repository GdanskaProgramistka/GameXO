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
        System.out.println("Podaj pozycję w pionie:");
        int positionX = scan.nextInt();
        try {
            System.out.println("Twój wybór to: " + positionX);
        }
        catch(NoSuchElementException e){
            System.out.println("Podaj liczbę!");
            positionX = scan.nextInt();
        }
        System.out.println("Podaj pozycję w poziomie:");
        int positionY = scan.nextInt();
        try {
            System.out.println("Twój wybór to: " + positionY);
        }
        catch(NoSuchElementException e){
            System.out.println("Podaj liczbę!");
        }
        while (!board.isSetable(positionX, positionY)) {
            positionX = scan.nextInt();
            try {
                System.out.println("Twój wybór to: " + positionX);
            }
            catch(NoSuchElementException e){
                System.out.println("Podaj liczbę!");
            }
            System.out.println("Podaj pozycję w poziomie:");
            positionY = scan.nextInt();
            try {
                System.out.println("Twój wybór to: " + positionY);
            }
            catch(NoSuchElementException e){
                System.out.println("Podaj liczbę!");
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