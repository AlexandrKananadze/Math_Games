package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static int gcd1(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd1(b, a % b);
    }

    public static void gcd() {
        Engine.getName();
        Scanner con = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers");
        for (int i = 0; i < Engine.TRY_ATTEMPT_NUMBER;) {
            int rand = Engine.genRandom();
            int rand1 = Engine.genRandom();
            System.out.println("Question:" + rand + " " + rand1);
            System.out.println("You answer: ");
            int answer = con.nextInt();
            if (answer == gcd1(rand, rand1)) {
                Engine.correctAnswerOutPut();
                i++;
            } else {
                Engine.wrongAnswerOutputInt(Engine.getUsername(), answer, gcd1(rand, rand1));
                break;
            }
            Engine.winner(i, Engine.getUsername());
        }
    }
}


