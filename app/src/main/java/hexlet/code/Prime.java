package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void gameLogic() {
        final int rndMax = 1000;
        Scanner sc = new Scanner(System.in);
        Random randNum = new Random();
        Engine.userGreetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (Engine.questionCounter != Engine.MAX_QUESTIONS) {
            int num = randNum.nextInt(2, rndMax);
            boolean isPrime = true;
            System.out.println("Question: " + num);
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.print("Your answer: ");
            String answer = sc.next();
            if (answer.equals("yes") && isPrime) {
                System.out.println("Correct!");
                Engine.questionCounter++;
            } else if (answer.equals("no") && !isPrime) {
                System.out.println("Correct!");
                Engine.questionCounter++;
            } else {
                System.out.println("Let's try again, " + Engine.userName + "!");
                break;
            }
            if (Engine.questionCounter == Engine.MAX_QUESTIONS) {
                System.out.println("Congratulations, " + Engine.userName + "!");
            }
        }
    }
}
