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

    //Object entry[][] = new Object[3][3];                      ??????
    ArrayList<Object> xoBoardLine = new ArrayList<Object>();
    ArrayList<String> xoBoardColumn = new ArrayList<>();

    //List<List<String>> xoBoardLine;
    //List<String> xoBoardColumn;

    public Board(int size) {
        this.xoBoardLine = new ArrayList<>();
        this.xoBoardColumn = new ArrayList();

        for (int i = 0; i < size; i++) {
            xoBoardLine.add(xoBoardColumn);

            for (int j = 0; j < size; j++) {
                xoBoardLine.add("| |");
            }
        }
    }

    public boolean set (int position, String symbol) {
        if (position < 0 || position > xoBoardLine.size()-1 ) {
            return false;
        }
        else {
            xoBoardLine.set(position, symbol);
            return true;
        }
    }
    public boolean isEmpty (int position){
        if (xoBoardLine.get(position).equals("| |")) {
            return true;
        }
        else {
            return false;
        }
    }

}
