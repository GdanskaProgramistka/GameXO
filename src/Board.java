import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Board {

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

        /*for (String symbol : xoBoardLine) {
            System.out.print(symbol);
        }*/
    }

    public void set (int position, String symbol) {
        xoBoardLine.set(position, symbol);
        if(position <= 0 || position > xoBoardLine.size()){
            System.out.println("Position out of range. Enter the correct position");
        }
    }
}
