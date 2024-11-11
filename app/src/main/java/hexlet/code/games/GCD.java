package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static void startGame() {
        final int maxValue = 100;
        String[][] roundsData = new String[Engine.ROUNDS][2];
        String description = "Find the greatest common divisor of given numbers.";
        Random randNum = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num1 = randNum.nextInt(maxValue);
            int num2 = randNum.nextInt(maxValue);
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
