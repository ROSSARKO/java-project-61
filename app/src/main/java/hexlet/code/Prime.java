package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void gameLogic() {
        Scanner sc = new Scanner(System.in);
        Random randNum = new Random();
        boolean isPrime = true;
        Engine.userGreetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (Engine.questionCounter != 3) {
            int num = randNum.nextInt(2, 1000);
            System.out.println("Question: " + num);
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            String answer = sc.next();
            if (answer.equals("yes") && isPrime) {
                System.out.println("Correct!\n");
                Engine.questionCounter++;
            } else if (answer.equals("no") && !isPrime) {
                System.out.println("Correct!\n");
                Engine.questionCounter++;
            } else {
                System.out.println("Let's try again, " + Engine.userName + "!");
                break;
            }
            if (Engine.questionCounter == 3) {
                System.out.println("Congratulations, " + Engine.userName + "!");
            }
        }
    }
}
