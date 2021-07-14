package hexlet.code.games;

import hexlet.code.Engine2;
import java.util.HashMap;
import java.util.Map;


public class GCD1 {
private static int a;
private static int b;
public static final String TASK = "Find the greatest common divisor of given numbers";

    public static int gcd1(int first, int second) {
        if (second == 0) {
            return first;
        }
        return gcd1(second, first % second);
    }

    public static String generetionTask() {
         a = Engine2.genRandom();
         b = Engine2.genRandom();
        return  "Question: " + a + " "  + b + "?";
    }

    public static String rightAnswerCount() {
        if (b == 0) {
        return a + "";
    }
        return (gcd1(b, a % b)) + "";
    }

    public static Map<String, String> threeTaskGenerationGCD() {
        Map<String, String> threeTask = new HashMap<>();
        for (int i = 0; i < Engine2.TRY_ATTEMPT_NUMBER; i++) {
            threeTask.put(generetionTask(), (rightAnswerCount()));
        }
        return threeTask;
    }

    public static void runnerGCD() {
        Engine2.executeEngineInThisGame(TASK, threeTaskGenerationGCD());
    }
}
