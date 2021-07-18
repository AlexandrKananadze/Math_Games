package hexlet.code.games;

import hexlet.code.Engine2;
import java.util.HashMap;
import java.util.Map;


public class GCD1 {
    private static int a;
    private static int b;
    private static final String TASK = "Find the greatest common divisor of given numbers";
    private static final Map<String, String> GENERATED_TASKS = new HashMap<>();
    public static int gcd1(int first, int second) {
        if (second == 0) {
            return first;
        }
        return gcd1(second, first % second);
    }

    public static String generetionTask() {
        a = Engine2.genRandom();
        b = Engine2.genRandom();
        return "Question: " + a + " " + b + "?";
    }

    public static String rightAnswerCount() {
        if (b == 0) {
            return String.valueOf(a);
        }
        return String.valueOf(gcd1(b, a % b));
    }

    public static Map<String, String> questionsToAnswersGCD() {
        for (int i = 0; i < Engine2.NUMBER_OF_ATTEMPS; i++) {
            GENERATED_TASKS.put(generetionTask(), (rightAnswerCount()));
        }
        return GENERATED_TASKS;
    }

    public static void runnerGCD() {
        Engine2.execute(TASK, questionsToAnswersGCD());
    }
}
