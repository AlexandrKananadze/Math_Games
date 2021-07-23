package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;


public class Gcd {

    private static final int RANGE_RANDOM = 100;

    public static int countGcd(int first, int second) {
        if (second == 0) {
            return first;
        }
        return countGcd(second, first % second);
    }

    public static String generateQuestion(int a, int b) {
        return "Question: " + a + " " + b + "?";
    }

    public static String rightAnswerCount(int a, int b) {
        return String.valueOf(countGcd(b, a % b));
    }

    public static Map<String, String> generateTask() {
        Map<String, String> generatedTasks = new HashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ATTEMPTS; i++) {
            int a = Engine.genRandom(RANGE_RANDOM);
            int b = Engine.genRandom(RANGE_RANDOM);
            generatedTasks.put(generateQuestion(a, b), (rightAnswerCount(a, b)));
        }
        return generatedTasks;
    }

    public static void runGCD() {
        String task = "Find the greatest common divisor of given numbers";
        Engine.execute(task, generateTask());
    }
}
