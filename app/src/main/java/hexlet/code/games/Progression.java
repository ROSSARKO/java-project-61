package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void startGame() {
        String[][] roundsData = new String[Engine.ROUNDS][2];
        String description = "What number is missing in the progression?";

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int[] progression = getProgression();
            int randHideElement = Utils.generateNumber(0, 9);
            String[] progressionWithDots = new String[progression.length];

            for (int k = 0; k < progression.length; k++) {
                if (k == randHideElement) {
                    progressionWithDots[k] = "..";
                } else {
                    progressionWithDots[k] = String.valueOf(progression[k]);
                }
            }
            String question = String.join(" ", progressionWithDots);
            roundsData[i][0] = question;
            roundsData[i][1] = String.valueOf(progression[randHideElement]);
        }
        Engine.run(description, roundsData);
    }

    private static int[] getProgression() {
        final int arrLength = 10;
        int progressionStep = Utils.generateNumber(1, 10);
        int firstNum = Utils.generateNumber(1, 100);

        int[] progression = new int[arrLength];
        progression[0] = firstNum;
        for (int j = 1; j < progression.length; j++) {
            progression[j] = progression[j - 1] + progressionStep;
        }
        return progression;
    }
}
