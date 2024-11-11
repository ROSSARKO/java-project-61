package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String userName;
    public static final int ROUNDS = 3;

    public static void run(String description, String[][] roundsData) {
        userGreetings();
        System.out.println(description);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < roundsData.length; i++) {
            String question = roundsData[i][0];
            String correctAnswer = roundsData[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = sc.next();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer "
                    + "was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + userName);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void userGreetings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }
}
