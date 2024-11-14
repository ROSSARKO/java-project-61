package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void startGame() {
        String[][] roundsData = new String[Engine.ROUNDS][2];
        String description = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num1 = Utils.generateNumber(0, 100);
            int num2 = Utils.generateNumber(0, 100);
            String question = num1 + " " + num2;
            int result = gcdCalculate(num1, num2);
            roundsData[i][0] = question;
            roundsData[i][1] = String.valueOf(result);
        }
        Engine.run(description, roundsData);
    }

    private static int gcdCalculate(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
