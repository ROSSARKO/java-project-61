package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;
    private static final int EXIT = 0;

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
            case GREET:
                Cli.greet();
                break;
            case EVEN_GAME:
                Even.startGame();
                break;
            case CALC_GAME:
                Calc.startGame();
                break;
            case GCD_GAME:
                GCD.startGame();
                break;
            case PROGRESSION_GAME:
                Progression.startGame();
                break;
            case PRIME_GAME:
                Prime.startGame();
                break;
            case EXIT:
                System.out.println("Quit the game...");
                break;
            default:
                System.out.println("Incorrect input, try again!");
        }

    }
}
