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
                "xoBoardLine=" + rows +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(rows, board.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rows);
    }


    List<List<String>> rows;
    List<String> column;

    public Board(int size) {
        this.rows = new ArrayList<>();
        this.column = new ArrayList<>();

        column = new ArrayList<>();

        rows.add(column);
        column.add("| |");

        for (int i = 0; i < size; i++) {
            rows.add(column);
            for (int j = 0; j < size; j++) {
                column.add("| |");
                System.out.print(rows.get(i).get(j));
            }
            System.out.println();
        }
    }

    public boolean set (int position, String symbol) {
        if (position < 0 || position > rows.size()-1 ) {
            return false;
        }
        else {
            column.set(position, symbol);
            return true;
        }
    }
    public boolean isEmpty (int position){
        if (column.get(position).equals("| |")) {
            return true;
        }
        else {
            return false;
        }
    }

}
