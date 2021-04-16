import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Initialization {

    public static void declarePlayers() {
        Players.createPlayers();
    }

    public static int getNumberOfRounds() {
        System.out.println("Enter the number of rounds:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int boardGetSize() {
        System.out.println("Enter the size of board:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
