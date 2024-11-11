package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void gameLogic() {
        final int maxValue = 100;
        Engine.userGreetings();
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner sc = new Scanner(System.in);
        int result;
        while (Engine.getQuestionCounter() != Engine.getMaxQuestions()) {
            Random randNum = new Random();
            int num1 = randNum.nextInt(maxValue);
            int num2 = randNum.nextInt(maxValue);
            System.out.println("Question: " + num1 + " " + num2);
            int answer = sc.nextInt();
            result = Engine.gcdGenerate(num1, num2);
            if (answer == result) {
                System.out.println("Correct!\n");
                Engine.incrementQuestionsCounter();
            } else {
                System.out.println("Your answer: " + answer);
                System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                        + "Correct answer was" + "'" + result + "'");
                System.out.println("Let's try again, " + Engine.getUserName() + "!");
                break;
            }
            if (Engine.getQuestionCounter() == Engine.getMaxQuestions()) {
                System.out.println("Congratulations, " + Engine.getUserName() + "!");
            }
        }
    }
}
