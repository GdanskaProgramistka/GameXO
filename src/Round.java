public class Round {

    public boolean isEnd;
    int roundNumber;
    int numberOfSymbols;
    int numberOfWinningSymbols = 3;
    int currentPositionX;
    int currentPositionY;


    public Round(int roundNumber) {
        this.roundNumber = roundNumber;
    }


    //check in HORIZONTAL: ------------------------------------------------------------------------------------------
    public boolean checkHorizontal(Board board, Symbol symbol, Position position) {
        numberOfSymbols = 0;

        for (int i = 1; i <= (numberOfWinningSymbols * 2) - 1; i++) {
            currentPositionX = position.getPositionX();
            currentPositionY = position.getPositionY() - (numberOfWinningSymbols - i);
            if (currentPositionY < 0 || currentPositionY > board.rows.size() - 1) {
                return false;
            } else {
                if (foundSymbol(board, symbol.getSymbol())) {
                    return true;
                }
            }
        }
        return false;
    }

    //check in VERTICAL: ------------------------------------------------------------------------------------------
    public boolean checkVertical(Board board, Symbol symbol, Position position) {
        numberOfSymbols = 0;
        for (int i = 1; i <= (numberOfWinningSymbols * 2) - 1; i++) {
            currentPositionX = position.getPositionX() - (numberOfWinningSymbols - i);
            currentPositionY = position.getPositionY();
            if (currentPositionX < 0 || currentPositionX > board.rows.size() - 1) {
                return false;
            } else {
                if (foundSymbol(board, symbol.getSymbol())) {
                    return true;
                }
            }
        }
        return false;
    }

    //check in DIAGONAL1:  ---------------------------------------------------------------------------------------
    public boolean checkDiagonal1(Board board, Symbol symbol, Position position) {
        numberOfSymbols = 0;
        for (int i = 1; i <= (numberOfWinningSymbols * 2) - 1; i++) {
            currentPositionX = position.getPositionX() - (numberOfWinningSymbols - i);
            currentPositionY = position.getPositionY() - (numberOfWinningSymbols - i);
            if (currentPositionX < 0 || currentPositionY < 0 || currentPositionX > board.rows.size() - 1 || currentPositionY > board.rows.size() - 1) {
                return false;
            }
            else {
                if (foundSymbol(board, symbol.getSymbol())) {
                    return true;
                }
            }
        }
        return false;
    }

    //check in DIAGONAL2:  ---------------------------------------------------------------------------------------
    public boolean checkDiagonal2(Board board, Symbol symbol, Position position) {
        numberOfSymbols = 0;
        for (int i = 1; i <= (numberOfWinningSymbols * 2) - 1; i++) {
            currentPositionX = position.getPositionX() + (numberOfWinningSymbols - i);
            currentPositionY = position.getPositionY() - (numberOfWinningSymbols - i);
            if (currentPositionX < 0 || currentPositionY < 0 || currentPositionX > board.rows.size() - 1 || currentPositionY > board.rows.size() - 1) {
                return false;
            }
            else {
                if (foundSymbol(board, symbol.getSymbol())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean foundSymbol(Board board, String symbol) {
        if (board.rows.get(currentPositionX).get(currentPositionY).equals(symbol)) {
            numberOfSymbols++;
            if (numberOfSymbols == numberOfWinningSymbols) {
                System.out.println("You won the round! You have 3 symbols next to each other.");
                return true;
            }
        } else {
            numberOfSymbols = 0;
        }
        return false;
    }
}







