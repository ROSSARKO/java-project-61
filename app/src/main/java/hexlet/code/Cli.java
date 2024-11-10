package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void userGreeting() {
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        System.out.println("Hello " + userName + "!");
        System.out.println("Welcome to the Brain Games!");
    }
}
