public class GameOver {

    public static boolean gameOver;

    public static void checkWinner(Player player1, Player player2) {
        if (player1.win > player2.win) {
            System.out.println("Game Over. The winner is " + player1 + ". Congratulations!");
        } else if (player1.win < player2.win) {
            System.out.println("Game Over. The winner is " + player2 + ". Congratulations!");
        } else {
            System.out.println("There is a tie");
        }
    }

    // try to QUIT method:
    public static boolean positionXIsQuit(int positionX){
        String quit = "quit";
        if (positionX == Integer.parseInt(quit)) {
            System.out.println("GAME OVER po wciśnięciu guzika quit");
            return true;
        }
        else {
            return false;
            }
    }

    public static boolean positionYIsQuit(int positionY){
        String quit = "quit";
        if (positionY == Integer.parseInt(quit)) {
            System.out.println("GAME OVER po wciśnięciu guzika quit");
            return true;
        }
        else {
            System.out.println("Game NIE over:P");
            return false;
        }
    }
}

       /* if (positionX.matches("[quit]")) {
            System.out.println("Koniec gry");
            return;
        }
        if (positionX.matches("[quit]")) {
            System.out.println("Koniec gry");
            return;
        }
        else {
            continue;
        }*/
