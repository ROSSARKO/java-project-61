package hexlet.code;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void gameLogic() {
        Scanner sc = new Scanner(System.in);
        int[] progression = new int[10];
        Random randNum = new Random();

        Engine.userGreetings();
        System.out.println("What number is missing in the progression?");
        while (Engine.questionCounter != 3) {
            int progressionStep = randNum.nextInt(1,10);
            int randHideElement= randNum.nextInt(0,9);
            int firstNum = randNum.nextInt(1,100);
            progression[0] = firstNum;
            for(int i = 1; i < progression.length; i++) {
                progression[i] = progression[i - 1] + progressionStep;
            }
            int hideElement = progression[randHideElement];
            String[] progressionWithDots = new String[progression.length];
            for(int i = 0; i < progression.length; i++) {
                if(i == randHideElement) {
                    progressionWithDots[i] = "...";
                } else {
                    progressionWithDots[i] = String.valueOf(progression[i]);
                }
            }
            System.out.println(String.join(" ", progressionWithDots));
            int answer = sc.nextInt();

            if (answer == hideElement) {
                System.out.println("Correct!\n");
                Engine.questionCounter++;
            } else {
                System.out.println("Your answer: " + answer);
                System.out.println("'" + answer + "'" + "is wrong answer ;(. " +
                        "Correct answer was" + "'" + hideElement + "'");
            }
            if(Engine.questionCounter == 3) {
                System.out.println("Congratulations! " + Engine.userName);
            }
        }

    }
}
