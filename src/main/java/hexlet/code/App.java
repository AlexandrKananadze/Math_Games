package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.MathProgression;
import hexlet.code.games.Prime;
import hexlet.code.games.Gcd;
import java.util.Scanner;

public class App {
    private static final int GREETING = 1;
    private static final int EXIT = 0;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int MATH_PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {

        System.out.println("Welcome to Brain Games!");
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice:");
        Scanner console = new Scanner(System.in);
        int gameNumber = console.nextInt();
        switch (gameNumber) {
            case GREETING:
                Cli.cli();
                break;

            case EVEN:
                Even.runEven();
                break;

            case CALC:
                Calc.runCalc();
                break;
            case GCD:
                Gcd.runGCD();
                break;

            case MATH_PROGRESSION:
                MathProgression.runMathProgression();
                break;

            case PRIME:
                Prime.runPrime();
                break;

            case EXIT:
                System.out.println("Exit");
                break;

            default:
                break;
        }
    }
}
