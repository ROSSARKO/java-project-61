package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Calc {
    public static void startGame() {
        final int rndMax = 100;
        final int mathSymbolMax = 3;
        char[] mathSymbols = {'+', '-', '*'};
        String[][] roundsData = new String[Engine.ROUNDS][2];
        String description = "What is the result of the expression?";
        Random randNum = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randMathSymbol = randNum.nextInt(mathSymbolMax);
            int num1 = randNum.nextInt(rndMax);
            int num2 = randNum.nextInt(rndMax);

            String question = num1 + " " + mathSymbols[randMathSymbol] + " " + num2;

            int result = switch (mathSymbols[randMathSymbol]) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                default -> 0;
            };

            roundsData[i][0] = question;
            roundsData[i][1] = String.valueOf(result);
        }
        Engine.run(description, roundsData);
    }
}
