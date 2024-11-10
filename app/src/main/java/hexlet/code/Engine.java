package hexlet.code;

import java.util.Arrays;
import java.util.Scanner;

public class Engine {
    private static String userName = "";
    private static int questionCounter = 0;
    private static final int MAX_QUESTIONS = 3;

    public static void userGreetings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void selectGame() {
        String[] gamesList = {"1 - Greet", "2 - Even", "3 - Calc", "4 - GCD", "5 - Progression", "6 - Prime", "0 - Exit"};
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
            case 0 -> System.console();
            case 1 -> Cli.userGreeting();
            case 2 -> EvenGame.gameLogic();
            case 3 -> Calc.gameLogic();
            case 4 -> GCD.gameLogic();
            case 5 -> Progression.gameLogic();
            case 6 -> Prime.gameLogic();
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
    public static String getUserName(){
        return userName;
    }
    public static int getMaxQuestions() {
        return MAX_QUESTIONS;
    }
    public static int getQuestionCounter() {
        return questionCounter;
    }
    public static void setQuestionCounter(int newValue) {
        questionCounter = newValue;
    }
    public static void incrementQuestionsCounter() {
        questionCounter++;
    }

}
