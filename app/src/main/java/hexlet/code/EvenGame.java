package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static void gameLogic() {
        Scanner sc = new Scanner(System.in);
        Engine.userGreetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (Engine.questionCounter != 3) {
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            System.out.println("Question: " + randNum);
            String answer = sc.next();
            if(randNum % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct! " + Engine.userName + "\n");
                Engine.questionCounter++;
            } else if (randNum % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!\n");
                Engine.questionCounter++;
            } else {
                System.out.println("Let's try again! " + Engine.userName + "\n");
            }
            if(Engine.questionCounter == 3) {
                System.out.println("Congratulations, " + Engine.userName + "!");
            }
        }
    }
}
