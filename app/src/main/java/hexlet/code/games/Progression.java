package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void startGame() {
        final int PROGRESSION_LENGTH = 10;
        String[][] roundsData = new String[Engine.ROUNDS][2];
        String description = "What number is missing in the progression?";

        for (int i = 0; i < Engine.ROUNDS; i++) {
            String[] progression = makeProgression(
                Utils.generateNumber(1, 100),
                Utils.generateNumber(1, 10), PROGRESSION_LENGTH);
            int hiddenMemberIndex = Utils.generateNumber(0, 9);
            String answer = progression[hiddenMemberIndex];

            progression[hiddenMemberIndex] = "..";
            String question = String.join(" ", progression);

            roundsData[i][0] = question;
            roundsData[i][1] = answer;
        }
        Engine.run(description, roundsData);
    }

    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(first + i * step);
        }
        return progression;
    }
}
