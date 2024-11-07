package hexlet.code;

import java.util.Arrays;
import java.util.Scanner;

public class Engine {
    public static String userName = "";
    public static int questionCounter = 0;
    public static void userGreetings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?\n");
        userName = sc.next();
        System.out.println("Hello " + userName + "\n");
    }
    public static void selectGame() {
        String[] gamesList = {"1 - Greet", "2 - Even", "3 - Calc", "0 - Exit"};
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
            case 3: Calc.gameLogic();
                break;
        }
    }
}