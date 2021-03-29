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
       /* System.out.println("Enter the horizontal position:");
       //exception:
        try {
            int positionX = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("It's not a number. Please enter the correct value.");
        }
        try {
            int positionY = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("It's not a number. Please enter the correct value.");
        }*/

     // quit:
       /* System.out.println("Enter the vertical position:");
        int positionX = scan.nextInt();
        String quit = "quit";
        double qDouble = Double.valueOf(quit);
        if(positionX == qDouble){
            System.out.println("Koniec Gry");*/
        //System.out.println("Enter the horizontal position:");
        //System.out.println("It's not a number. Please enter the correct value.");*/
        int positionX = scan.nextInt();
        int positionY = scan.nextInt();
        while (!board.isSetable(positionX, positionY)) {
            positionX = scan.nextInt();
            positionY = scan.nextInt();
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