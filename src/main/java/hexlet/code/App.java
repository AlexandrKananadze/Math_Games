package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.MathProgression;
import hexlet.code.games.Prime;
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
        System.out.println();
        Scanner bar = new Scanner(System.in);
        int gameNumber = bar.nextInt();
        Engine.inputCheckMenu(gameNumber);

        if (gameNumber == Engine.GREETING) {
            Cli.clis();
        }
        if (gameNumber == Engine.EVEN) {
            Even.even();
        }
        if (gameNumber == Engine.CALC) {
            Calc.calc();
        }
        if (gameNumber == Engine.GCD) {
            GCD.gcd();
        }
        if (gameNumber == Engine.MATHPROGRESSION) {
            MathProgression.mathProg();
        }
        if (gameNumber == Engine.PRIME) {
            Prime.prime();
        }
        if (gameNumber == Engine.EXIT) {
            System.out.println("Exit");
        }
    }
}
