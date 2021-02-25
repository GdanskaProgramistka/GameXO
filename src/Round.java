public class Round {

    public boolean isEnd;
    int roundNumber;
    int numberOfSymbols;
    int numberOfWinningSymbols;
    int currentPosition;

    public Round(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public boolean checkHorizontal(Board board, String symbol, int positionX) {
        currentPosition = positionX;
        numberOfSymbols = 0;
        //for (board.rows.get(positionX)) {
            for (int i = (positionX - (numberOfWinningSymbols - 1)); i <= (positionX + (numberOfWinningSymbols - 1)) ; i++) {
                if (board.rows.get(positionX).get(i).equals(symbol)) {
                    numberOfSymbols++;
                    if (numberOfSymbols == numberOfWinningSymbols) {
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
