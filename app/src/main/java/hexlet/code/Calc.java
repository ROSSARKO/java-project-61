package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void gameLogic() {
        final int RND_MAX_VALUE = 100;
        final int MATH_SYMBOL_MAX_VALUE = 3;
        Engine.userGreetings();
        Scanner sc = new Scanner(System.in);
        char[] mathSymbols = {'+', '-', '*'};
        int result = 0;
        System.out.println("What is the result of the expression?\n");
        while (Engine.questionCounter != Engine.MAX_QUESTIONS) {
            Random randNum = new Random();
            int randMathSymbol = randNum.nextInt(MATH_SYMBOL_MAX_VALUE);
            int num1 = randNum.nextInt(RND_MAX_VALUE);
            int num2 = randNum.nextInt(RND_MAX_VALUE);
            System.out.println("Question: " + num1 + " " + mathSymbols[randMathSymbol] + " " + num2);
            result = switch (mathSymbols[randMathSymbol]) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                default -> result;
            };
            int answer = sc.nextInt();
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
