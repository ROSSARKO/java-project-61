package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void gameLogic() {
        final int MAX_VALUE = 100;
        Engine.userGreetings();
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner sc = new Scanner(System.in);
        int result;
        while (Engine.questionCounter != Engine.MAX_QUESTIONS) {
            Random randNum = new Random();
            int num1 = randNum.nextInt(MAX_VALUE);
            int num2 = randNum.nextInt(MAX_VALUE);
            System.out.println("Question: " + num1 + " " + num2);
            int answer = sc.nextInt();
            result = Engine.gcdGenerate(num1, num2);
            if (answer == result) {
                System.out.println("Correct!\n");
                Engine.questionCounter++;
            } else {
                System.out.println("Your answer: " + answer);
                System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                        + "Correct answer was" + "'" + result + "'");
                System.out.println("Let's try again, " + Engine.userName + "!");
                break;
            }
            if (Engine.questionCounter == Engine.MAX_QUESTIONS) {
                System.out.println("Congratulations, " + Engine.userName + "!");
            }
        }
    }
}
