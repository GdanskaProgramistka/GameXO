import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Board {

    private int positionX;
    private int PositionY;
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

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                column.add("| |");
                System.out.print(column.get(j));
            }
            rows.add(column);
            column = new ArrayList<>();
            System.out.println();
        }
    }

    public boolean set (int positionX, int positionY, String symbol) {
        if (positionX < 0 || positionY < 0 || positionX > rows.size()-1 || positionY > rows.size()-1) {
            return false;
        }
        else {
            rows.get(positionX).set(positionY, symbol);
            return true;
        }
    }
    public boolean isEmpty (int positionX, int positionY){
        if (rows.get(positionX).get(positionY).equals("| |")){
        //if (rows.get(positionX).contains(column.get(positionY).equals("| |"))){
        //if (column.get(positionY).equals("| |")) {
            return true;
        }
        else {
            return false;
        }
    }

}
