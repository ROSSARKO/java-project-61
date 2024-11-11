package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit""");
        System.out.print("Your choice: ");
        int selectedGame = sc.nextInt();
        switch (selectedGame) {
            case 1:
                Cli.greet();
                break;
            case 2:
                Even.startGame();
                break;
            case 3:
                Calc.startGame();
                break;
            case 4:
                GCD.startGame();
                break;
            case 5:
                Progression.startGame();
                break;
            case 6:
                Prime.startGame();
                break;
            case 0:
                System.out.println("Quit the game...");
                break;
            default:
                System.out.println("Incorrect input, try again!");
        }

    }
}
