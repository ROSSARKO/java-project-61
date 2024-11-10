package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void gameLogic() {
        Engine.userGreetings();
        System.out.println("Find the greatest common divisor of given numbers");
        Scanner sc = new Scanner(System.in);
        int result;
        while (Engine.questionCounter != 3) {
            Random randNum = new Random();
            int num1 = randNum.nextInt(100);
            int num2 = randNum.nextInt(100);
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
                break;
            }
            if (Engine.questionCounter == 3) {
                System.out.println("Congratulations, " + Engine.userName + "!");
            }
        }
    }
}
