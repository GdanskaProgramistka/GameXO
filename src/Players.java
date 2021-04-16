import java.util.*;

public class Players {

    private static int playerIndex = 1;
     static List<Player> createdPlayersList = new ArrayList<>();

    public static int getNumberOfPlayers() {
        System.out.println("Enter the number of players:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void createPlayers() {
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = getNumberOfPlayers();
        for (int i = 0; i < numberOfPlayers; i++) {
            Player player = new Player(playerGetName(), playerGetSymbol());
            createdPlayersList.add(player);
        }
    }

    public static String playerGetName() {
        System.out.println("Enter the name of player: " + playerIndex);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static Symbol playerGetSymbol() {
        System.out.println("Enter the symbol of player: " + playerIndex);
        Scanner scanner = new Scanner(System.in);
        Symbol symbol = new Symbol(scanner.next());
        playerIndex++;
        return symbol;
    }

    public static Player countWins() {
        Comparator<Player> winsComparator = (o1, o2) -> o2.win - o1.win;
        Collections.sort(createdPlayersList,winsComparator);
        return createdPlayersList.get(0);
    }
}
