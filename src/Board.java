import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Board {

    private int position;
    boolean inRange;
    Scanner scan = new Scanner(System.in);

    @Override
    public String toString() {
        return "Board{" +
                "xoBoardLine=" + xoBoardLine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(xoBoardLine, board.xoBoardLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xoBoardLine);
    }

    List<String> xoBoardLine;

    public Board(int size) {
        this.xoBoardLine = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            xoBoardLine.add("| |");
        }
    }

    public void set (int position, String symbol) {
        if (position < 0 || position > xoBoardLine.size()-1 ) {
            inRange = false;
            //System.out.println("Movement out of range. Repeat your move");
            //position = scan.nextInt();
            //xoBoardLine.set(position, symbol);
        }
        else{
            inRange = true;
            xoBoardLine.set(position, symbol);
        }
    }
}
