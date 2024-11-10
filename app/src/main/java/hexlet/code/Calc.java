package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void gameLogic() {
        Engine.userGreetings();
        Scanner sc = new Scanner(System.in);
        char[] mathSymbols = {'+', '-', '*'};
        int result = 0;
        System.out.println("What is the result of the expression?\n");
        while (Engine.questionCounter != 3) {
            Random randNum = new Random();
            int randMathSymbol = randNum.nextInt(3);
            int num1 = randNum.nextInt(100);
            int num2 = randNum.nextInt(100);
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
            if (Engine.questionCounter == 3) {
                System.out.println("Congratulations, " + Engine.userName + "!");
            }

        }
    }
}
