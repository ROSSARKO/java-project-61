package hexlet.code;

import hexlet.code.games.*;
import java.util.Arrays;
import java.util.Scanner;

public class Engine {
    private static String userName = "";
    private static int questionCounter = 0;
    private static final int MAX_QUESTIONS = 3;
    private static final int STAT_GREET = 0;
    private static final int STAT_EVEN = 1;
    private static final int STAT_CALC = 2;
    private static final int STAT_GCD = 3;
    private static final int STAT_PROGRESSION = 4;
    private static final int STAT_PRIME = 5;
    private static final int STAT_EXIT = 6;

    public static void userGreetings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void selectGame() {
        String[] gamesList = {"1 - Greet", "2 - Even", "3 - Calc", "4 - GCD",
            "5 - Progression", "6 - Prime", "0 - Exit"};
        Scanner sc = new Scanner(System.in);
        String formattedGamesList = Arrays.toString(gamesList)
                .replace("[", "")
                .replace(",", "\n")
                .replace("]", "")
                .replace(" ", "");
        System.out.println("Please enter the game number and press Enter");
        System.out.println(formattedGamesList);
        int gameNumber = sc.nextInt();
        switch (gameNumber) {
            case STAT_GREET -> System.console();
            case STAT_EVEN -> Cli.userGreeting();
            case STAT_CALC -> EvenGame.gameLogic();
            case STAT_GCD -> Calc.gameLogic();
            case STAT_PROGRESSION -> GCD.gameLogic();
            case STAT_PRIME -> Progression.gameLogic();
            case STAT_EXIT -> Prime.gameLogic();
            default -> System.console();
        }
    }

    public static int gcdGenerate(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static String getUserName() {
        return userName;
    }

    public static int getMaxQuestions() {
        return MAX_QUESTIONS;
    }

    public static int getQuestionCounter() {
        return questionCounter;
    }

    public static void incrementQuestionsCounter() {
        questionCounter++;
    }

}
