package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void gameLogic() {
        final int ARR_LENGTH = 10;
        final int STEP_MAX = 10;
        final int HIDE_ELEMENT_MAX = 9;
        final int FIRST_NUM_MAX = 100;
        Scanner sc = new Scanner(System.in);
        int[] progression = new int[ARR_LENGTH];
        Random randNum = new Random();

        Engine.userGreetings();
        System.out.println("What number is missing in the progression?");
        while (Engine.questionCounter != Engine.MAX_QUESTIONS) {
            int progressionStep = randNum.nextInt(1, STEP_MAX);
            int randHideElement = randNum.nextInt(0, HIDE_ELEMENT_MAX);
            int firstNum = randNum.nextInt(1, FIRST_NUM_MAX);
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
                Engine.questionCounter++;
            } else {
                System.out.println("Your answer: " + answer);
                System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                        + "Correct answer was" + "'" + hideElement + "'");
                System.out.println("Let's try again, " + Engine.userName + "!");
                break;
            }
            if (Engine.questionCounter == Engine.MAX_QUESTIONS) {
                System.out.println("Congratulations, " + Engine.userName + "!");
            }
        }

    }
}
