import java.util.Scanner;

public class Initialization {

    public static void playerGetName(Player player) {
        System.out.println("Enter the name of player: " + player);
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();
    }

    public static void gameGetNumberOfRound(Round round){
        System.out.println("Enter the number of rounds:");
        Scanner scanner = new Scanner(System.in);
        int numberOfRoundsInGame = scanner.nextInt();
    }
}
