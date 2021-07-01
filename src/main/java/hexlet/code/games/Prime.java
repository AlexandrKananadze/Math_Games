package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {

    private static String check(int n) {
        String rightanswer = "yes";
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                rightanswer = "no";
                break;
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
