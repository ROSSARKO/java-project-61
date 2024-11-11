package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void gameLogic() {
        final int arrLength = 10;
        final int stepMax = 10;
        final int hideElementMax = 9;
        final int firstNumMax = 100;
        Scanner sc = new Scanner(System.in);
        int[] progression = new int[arrLength];
        Random randNum = new Random();

        Engine.userGreetings();
        System.out.println("What number is missing in the progression?");
        while (Engine.getQuestionCounter() != Engine.getMaxQuestions()) {
            int progressionStep = randNum.nextInt(1, stepMax);
            int randHideElement = randNum.nextInt(0, hideElementMax);
            int firstNum = randNum.nextInt(1, firstNumMax);
            progression[0] = firstNum;
            for (int i = 1; i < progression.length; i++) {
                progression[i] = progression[i - 1] + progressionStep;
            }
            int hideElement = progression[randHideElement];
            String[] progressionWithDots = new String[progression.length];
            for (int i = 0; i < progression.length; i++) {
                if (i == randHideElement) {
                    progressionWithDots[i] = "..";
                } else {
                    progressionWithDots[i] = String.valueOf(progression[i]);
                }
            }
            System.out.println("Question: " + String.join(" ", progressionWithDots));
            int answer = sc.nextInt();

            if (answer == hideElement) {
                System.out.println("Correct!\n");
                Engine.incrementQuestionsCounter();
            } else {
                System.out.println("Your answer: " + answer);
                System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                        + "Correct answer was" + "'" + hideElement + "'");
                System.out.println("Let's try again, " + Engine.getUserName() + "!");
                break;
            }
            if (Engine.getQuestionCounter() == Engine.getMaxQuestions()) {
                System.out.println("Congratulations, " + Engine.getUserName() + "!");
            }
        }

    }
}