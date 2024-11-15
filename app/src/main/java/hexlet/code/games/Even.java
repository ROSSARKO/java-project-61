package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MIN = 0;
    private static final int MAX = 100;
    public static void startGame() {

        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int question = Utils.generateNumber(MIN, MAX);
            String answer = (question % 2 == 0) ? "yes" : "no";
            roundsData[i][0] = String.valueOf(question);
            roundsData[i][1] = answer;
        }
        Engine.run(description, roundsData);
    }
}
