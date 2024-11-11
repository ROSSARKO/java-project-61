package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void startGame() {
        final int rndMax = 100;
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[Engine.ROUNDS][2];
        Random rand = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int question = rand.nextInt(rndMax);
            String answer = (question % 2 == 0) ? "yes" : "no";
            roundsData[i][0] = String.valueOf(question);
            roundsData[i][1] = answer;
        }
        Engine.run(description, roundsData);
    }
}
