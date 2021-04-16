public class GameOver {

    public static boolean gameOver;

    public static void checkWinner() {
        System.out.println("Game Over. The winner is " + Players.countWins() + ". Congratulations!");
        System.exit(0);
    }

//    public static void checkWinner(Player player1, Player player2) {
//        if (player1.win > player2.win) {
//            System.out.println("Game Over. The winner is " + player1 + ". Congratulations!");
//            System.exit(0);
//        } else if (player1.win < player2.win) {
//            System.out.println("Game Over. The winner is " + player2 + ". Congratulations!");
//            System.exit(0);
//        } else {
//            System.out.println("There is a tie");
//            System.exit(0);
//        }
//    }

    public static boolean isQuit(String positionXString, String positionYString) {
       if (positionXString.equals("quit") || positionYString.equals("quit")) {
            System.out.println("GAME OVER. You left the game.");
            System.exit(0);
            return true;
        }
       return false;
    }
}
