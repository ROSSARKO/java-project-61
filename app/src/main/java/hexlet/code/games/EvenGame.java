package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static void gameLogic() {
        final int rndMax = 100;
        Scanner sc = new Scanner(System.in);
        Engine.userGreetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (Engine.getQuestionCounter() != Engine.getMaxQuestions()) {
            Random rand = new Random();
            int randNum = rand.nextInt(rndMax);
            System.out.println("Question: " + randNum);
            System.out.print("Your answer: ");
            String answer = sc.next();
            if (randNum % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct! " + Engine.getUserName() + "\n");
                Engine.incrementQuestionsCounter();
            } else if (randNum % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!\n");
                Engine.incrementQuestionsCounter();
            } else {
                System.out.println("Let's try again, " + Engine.getUserName() + "!");
                break;
            }
            if (Engine.getQuestionCounter() == Engine.getMaxQuestions()) {
                System.out.println("Congratulations, " + Engine.getUserName() + "!");
            }
        }
    }
}
