import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Board {

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

    public void printBoard(){
        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < rows.get(i).size(); j++) {
                System.out.print(rows.get(i).get(j));
            }
            System.out.println();
        }
    }

    public void set (int positionX, int positionY, String symbol) {
        rows.get(positionX).set(positionY, symbol);
        System.out.println();
    }

    int pierwszeWejscieWPetle = 0;
    public boolean isSetable (int positionX, int positionY) {
        if (positionX < 0 || positionY < 0 || positionX > rows.size() - 1 || positionY > rows.size() - 1) {
            if (pierwszeWejscieWPetle == 0){
                System.out.println("Nic się nie wyświetla:P");
            }
            else {
                System.out.println("Position out of range. Please enter the correct position");
            }
            return false;
        }
        else if (!(rows.get(positionX).get(positionY).equals("| |"))) {
            System.out.println("Position is already taken. Please enter the correct position");
            return false;
        } else {
            return true;
        }
    }

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
}
