package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void gameLogic() {
        final int rndMax = 100;
        final int mathSymbolMax = 3;
        Engine.userGreetings();
        Scanner sc = new Scanner(System.in);
        char[] mathSymbols = {'+', '-', '*'};
        int result = 0;
        System.out.println("What is the result of the expression?\n");
        while (Engine.getQuestionCounter() != Engine.getMaxQuestions()) {
            Random randNum = new Random();
            int randMathSymbol = randNum.nextInt(mathSymbolMax);
            int num1 = randNum.nextInt(rndMax);
            int num2 = randNum.nextInt(rndMax);
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
