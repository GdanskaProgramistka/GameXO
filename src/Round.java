import java.util.List;

public class Round {

    public boolean isEnd;
    int roundNumber;

    public Round(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public boolean checkHorizontal(Board board, Symbol symbol, int positionX) {
        int numberOfSymbols = 0;
        //for (board.rows.get(positionX)) {
            for (int i = 0; i < board.rows.size(); i++) {
                if (board.rows.get(positionX).get(i).equals(symbol)) {
                    numberOfSymbols++;
                    if (numberOfSymbols == 3) {
                        System.out.println("Wygrałeś! Masz trzy " + symbol + "w poziomie.");
                        return true;
                    }
                }
                else {
                    numberOfSymbols = 0;
                }

                }
            return false;
    }
}
