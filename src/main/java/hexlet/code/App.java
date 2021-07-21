package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    private static final int GREETING = 1;
    private static final int EXIT = 0;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int MATH_PROGRESSION = 5;
    public static final int PRIME = 6;


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
                Even.runnerEven();
                break;

            case CALC:
                Calc.runnerCalc();
                break;
            case GCD:
                Gcd.runnerGCD();
                break;

            case MATH_PROGRESSION:
                MathProgression.runnerMathProgression();
                break;

            case PRIME:
                Prime.runnerPrime();
                break;

            case EXIT:
                System.out.println("Exit");
                break;

            default:
                break;
        }
    }
}
