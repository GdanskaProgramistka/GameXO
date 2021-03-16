public class Round {

    public boolean isEnd;
    int roundNumber;
    int numberOfSymbols;
    int numberOfWinningSymbols = 3;
    int currentPosition;

    public Round(int roundNumber) {
        this.roundNumber = roundNumber;
    }
//check in HORIZONTAL position:  ---------------------------------------------------------------------------------------
    public boolean checkHorizontal(Board board, Symbol symbol, Position position) {
        currentPosition = position.getPositionX();
        numberOfSymbols = 0;
        //for (board.rows.get(positionX)) {
        if (currentPosition == 0) {
            for (int i = currentPosition; i <= (currentPosition + (numberOfWinningSymbols - 1)) ; i++) {
                if (foundSymbolsHorizontal(board, symbol.getSymbol(), position, i))
                    return true;
            }
        }
        else if (currentPosition == 1) {
            for (int i = currentPosition - 1; i <= (currentPosition + (numberOfWinningSymbols - 1)) ; i++) {
                if (foundSymbolsHorizontal(board, symbol.getSymbol(), position, i))
                    return true;
            }
        }
        else if (currentPosition == board.rows.size() - 1) {   //curr. posit. on last position
            for (int i = (currentPosition - (numberOfWinningSymbols - 1)); i <= currentPosition; i++) {
                if (foundSymbolsHorizontal(board, symbol.getSymbol(), position, i))
                    return true;
            }
        }

        else if (currentPosition == board.rows.size() - 2) {   //curr. posit. on before last position
            for (int i = (currentPosition - (numberOfWinningSymbols - 1)); i <= currentPosition + 1; i++) {
                if (foundSymbolsHorizontal(board, symbol.getSymbol(), position, i))
                    return true;
            }
        }
        else {
            for (int i = (currentPosition - (numberOfWinningSymbols - 1)); i <= (currentPosition + (numberOfWinningSymbols - 1)); i++) {
                if (foundSymbolsHorizontal(board, symbol.getSymbol(), position, i))
                    return true;
            }
        }
            return false;
    }

    private boolean foundSymbolsHorizontal(Board board, String symbol, Position position, int i) {
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

//check in VERTICAL position:  -----------------------------------------------------------------------------------------
    public boolean checkVertical(Board board, Symbol symbol, Position position) {
        currentPosition = position.getPositionY();
        numberOfSymbols = 0;
        if (currentPosition == 0) {
            for (int i = currentPosition; i <= (currentPosition + (numberOfWinningSymbols - 1)) ; i++) {
                if (foundSymbolsVertical(board, symbol.getSymbol(), position, i))
                    return true;
            }
        }
        else if (currentPosition == 1) {
            for (int i = currentPosition - 1; i <= (currentPosition + (numberOfWinningSymbols - 1)) ; i++) {
                if (foundSymbolsVertical(board, symbol.getSymbol(), position, i))
                    return true;
            }
        }
        else if (currentPosition == board.rows.size() - 1) {   //curr. posit. on last position
            for (int i = (currentPosition - (numberOfWinningSymbols - 1)); i <= currentPosition; i++) {
                if (foundSymbolsVertical(board, symbol.getSymbol(), position, i))
                    return true;
            }
        }

        else if (currentPosition == board.rows.size() - 2) {   //curr. posit. on before last position
            for (int i = (currentPosition - (numberOfWinningSymbols - 1)); i <= currentPosition + 1; i++) {
                if (foundSymbolsVertical(board, symbol.getSymbol(), position, i))
                    return true;
            }
        }
        else {
            for (int i = (currentPosition - (numberOfWinningSymbols - 1)); i <= (currentPosition + (numberOfWinningSymbols - 1)); i++) {
                if (foundSymbolsVertical(board, symbol.getSymbol(), position, i))
                    return true;
            }
        }
        return false;
    }

    private boolean foundSymbolsVertical(Board board, String symbol, Position position, int i) {
        if (board.rows.get(i).get(currentPosition).equals(symbol)) {
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

    //check in DIAGONAL position:  ---------------------------------------------------------------------------------------

}
