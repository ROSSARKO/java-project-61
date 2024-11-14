package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void startGame() {
        String[][] roundsData = new String[Engine.ROUNDS][2];
        String description = "What is the result of the expression?";

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num1 = Utils.generateNumber(0, 100);
            int num2 = Utils.generateNumber(0, 100);
            char mathSymbol = getRandomMathSymbol();

            String question = num1 + " " + mathSymbol + " " + num2;

            int result = switch (mathSymbol) {
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

    private static char getRandomMathSymbol() {
        char[] mathSymbols = {'+', '-', '*'};
        int index = Utils.generateNumber(0, 2);
        return mathSymbols[index];
    }
}
