import java.util.Scanner;

public class Initialization {

    private static int playerIndex = 1;
    static Player player1;
    static Player player2;

    public static String playerGetName() {
        System.out.println("Enter the name of player: " + playerIndex++);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int gameGetNumberOfRounds(){
        System.out.println("Enter the number of rounds:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int boardGetSize(){
        System.out.println("Enter the size of board:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
