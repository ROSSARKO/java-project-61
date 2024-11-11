package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void startGame() {
        final int arrLength = 10;
        final int stepMax = 10;
        final int hideElementMax = 9;
        final int firstNumMax = 100;
        String[][] roundsData = new String[Engine.ROUNDS][2];
        Random randNum = new Random();
        String description = "What number is missing in the progression?";

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int progressionStep = randNum.nextInt(1, stepMax);
            int randHideElement = randNum.nextInt(0, hideElementMax);
            int firstNum = randNum.nextInt(1, firstNumMax);

            int[] progression = new int[arrLength];
            progression[0] = firstNum;
            for (int j = 1; j < progression.length; j++) {
                progression[j] = progression[j - 1] + progressionStep;
            }

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
}
