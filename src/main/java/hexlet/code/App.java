package hexlet.code;

import hexlet.code.games.Calc1;
import hexlet.code.games.Even1;
import hexlet.code.games.GCD1;
import hexlet.code.games.MathProgression1;
import hexlet.code.games.Prime1;
import java.util.Scanner;

public class App {
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
        Scanner bar = new Scanner(System.in);
        int gameNumber = bar.nextInt();
            switch (gameNumber) {
                case Engine2.GREETING:
                    Cli.cli();
                break;

               case Engine2.EVEN:
                   Even1.runnerEven();
               break;

                case Engine2.CALC:
                    Calc1.runnerCalc();
                break;
                case Engine2.GCD:
                    GCD1.runnerGCD();
                break;

                case Engine2.MATHPROGRESSION:
                    MathProgression1.runnerMathProgression();
                break;

                case Engine2.PRIME:
                    Prime1.runnerPrime();
                break;

                case Engine2.EXIT:
                    System.out.println("Exit");
                break;

                default:
                break;
        }
    }
}
