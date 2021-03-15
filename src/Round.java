public class Round {

    public boolean isEnd;
    int roundNumber;
    int numberOfSymbols;
    int numberOfWinningSymbols = 3;
    int currentPosition;

    public Round(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public boolean checkHorizontal(Board board, Symbol symbol, Position position) {
        currentPosition = position.getPositionX();
        numberOfSymbols = 0;
        //for (board.rows.get(positionX)) {
            for (int i = (currentPosition - (numberOfWinningSymbols - 1)); i <= (currentPosition + (numberOfWinningSymbols - 1)) ; i++) {
                if (foundSymbols(board, symbol.getSymbol(), position, i))
                    return true;
            }
            return false;
    }

    private boolean foundSymbols(Board board, String symbol, Position position, int i) {
        if (board.rows.get(currentPosition).get(i).equals(symbol)) {
            numberOfSymbols++;
            if (numberOfSymbols == numberOfWinningSymbols) {
                System.out.println("Wygrałeś! Masz " + numberOfWinningSymbols + symbol + "obok siebie.");
                return true;
            }
        }
        else {
            numberOfSymbols = 0;
        }
        return false;
    }
}
