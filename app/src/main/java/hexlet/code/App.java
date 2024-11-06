package hexlet.code;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] gamesList = {"1 - Greet", "2 - Even", "0 - Exit"};
        Scanner sc = new Scanner(System.in);
        String formattedGamesList = Arrays.toString(gamesList)
                        .replace("[","")
                                .replace(",","\n")
                                        .replace("]","")
                                                .replace(" ","");
        System.out.println("Please enter the game number and press Enter");
        System.out.println(formattedGamesList);
        int gameNumber = sc.nextInt();
        switch (gameNumber) {
            case 0: System.console();
                break;
            case 1: Cli.userGreeting();
                break;
            case 2: EvenGame.gameLogic();
                break;
        }
    }
}
