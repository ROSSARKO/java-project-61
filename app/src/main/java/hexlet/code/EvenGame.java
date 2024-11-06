package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static void gameLogic() {
        Scanner scName = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int questionCounter = 0;
        System.out.println("Welcome to the Brain Games!\nMay I have your name?\n");
        String usrName = scName.next();
        System.out.println("Hello " + usrName + "\n");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (questionCounter != 3) {
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            System.out.println("Question: " + randNum);
            String answer = sc.next();
            if(randNum % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct! " + usrName + "\n");
                questionCounter++;
            } else if (randNum % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!\n");
                questionCounter++;
            } else {
                System.out.println("Let's try again! " + usrName + "\n");
            }
            if(questionCounter == 3) {
                System.out.println("Congratulations! " + usrName);
            }
        }
    }
}
