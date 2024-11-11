package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void startGame() {
        final int rndMax = 1000;
        Random randNum = new Random();
        String[][] roundsData = new String[Engine.ROUNDS][2];
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num = randNum.nextInt(2, rndMax);
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            String answer = isPrime ? "yes" : "no";

            roundsData[i][0] = String.valueOf(num);
            roundsData[i][1] = answer;
        }
        Engine.run(description, roundsData);
    }
}
