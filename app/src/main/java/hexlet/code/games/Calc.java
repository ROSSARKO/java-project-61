package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MIN = 0;
    private static final int MAX = 100;

    public static void startGame() {
        String[][] roundsData = new String[Engine.ROUNDS][2];
        String description = "What is the result of the expression?";

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num1 = Utils.generateNumber(MIN, MAX);
            int num2 = Utils.generateNumber(MIN, MAX);
            char[] mathSymbols = {'+', '-', '*'};
            int index = Utils.generateNumber(0, 2);

            String question = num1 + " " + mathSymbols[index] + " " + num2;

            roundsData[i][0] = question;
            roundsData[i][1] = String.valueOf(calculate(mathSymbols[index], num1, num2));
        }
        Engine.run(description, roundsData);
    }

    private static int calculate(char operator, int num1, int num2) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> throw new RuntimeException("Unknown operator: " + operator);
        };
    }
}
