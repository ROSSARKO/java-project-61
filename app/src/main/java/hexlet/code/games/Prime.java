package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MIN = 2;
    private static final int MAX = 1000;

    public static void startGame() {

        String[][] roundsData = new String[Engine.ROUNDS][2];
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num = Utils.generateNumber(MIN, MAX);
            String answer = isPrime(num) ? "yes" : "no";
            roundsData[i][0] = String.valueOf(num);
            roundsData[i][1] = answer;
        }
        Engine.run(description, roundsData);
    }

    public static boolean isPrime(int num) {
        if (num <= 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
