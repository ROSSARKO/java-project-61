package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int STEP_MIN = 1;
    private static final int STEP_MAX = 10;
    private static final int FIRST_NUM_MIN = 1;
    private static final int FIRST_NUM_MAX = 100;
    private static final int HIDDEN_MIN = 0;
    private static final int HIDDEN_MAX = 9;
    public static void startGame() {


        String[][] roundsData = new String[Engine.ROUNDS][2];
        String description = "What number is missing in the progression?";

        for (int i = 0; i < Engine.ROUNDS; i++) {
            String[] progression = makeProgression(
                Utils.generateNumber(FIRST_NUM_MIN, FIRST_NUM_MAX),
                Utils.generateNumber(STEP_MIN, STEP_MAX), PROGRESSION_LENGTH);
            int hiddenMemberIndex = Utils.generateNumber(HIDDEN_MIN, HIDDEN_MAX);
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
