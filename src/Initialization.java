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
        int size = scanner.nextInt();
        while(size > 100000){
            System.out.println("Max size of board is 100000. Enter the size once again.");
            size = scanner.nextInt();
        }
        return size;
    }

    public static int getNumberOfWinningSymbols() {
        System.out.println("Enter the number of the winning symbols:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
