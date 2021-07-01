package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {

    private static int var = 1;

    private static String check(int n) {
        String rightanswer = "";
        if (n > 1) {
            if (n % var != 0) {
                var++;
                check(n);
            }
            if (n == var) {
                rightanswer = "yes";
            }
            if (n % var == 0 && n != var) {
                rightanswer = "no";
            }
        }
        return rightanswer;
    }

    public static void prime() {
        Engine.getName();
        Scanner con = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < Engine.TRY_ATTEMPT_NUMBER;) {
            int rand = Engine.genRandom();
            System.out.println("Question: " + rand);
            String answer = con.nextLine();
            String rightanswer = check(rand);

            if (answer.equals(rightanswer)) {
                Engine.correctAnswerOutPut();
                i++;
            }
            if (!answer.equals(rightanswer)) {
                Engine.wrongAnswerOutputString(Engine.getUsername(), answer, rightanswer);
                break;
            }
            Engine.winner(i, Engine.getUsername());
        }
    }
}
