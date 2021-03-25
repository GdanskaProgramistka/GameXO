public class GameOver {

    public static boolean gameOver;

    public static void checkWinner(Player player1, Player player2) {
        if (player1.win > player2.win){
            System.out.println("Game Over. The winner is " + player1 + ". Congratulations!");
        }
        else if (player1.win < player2.win){
            System.out.println("Game Over. The winner is " + player2 + ". Congratulations!");
        }
        else {
            System.out.println("There is a tie");
        }
    }
   // try to QUIT method:
    /*public static boolean isQuit(int positionX, int positionY){
        String quit = "quit";
        if (positionX.equals(quit)){
            return true;
        }
        if (positionY.equals(quit)){
            return true;
        }
        else {
            return false;
        }
    }*/
}
