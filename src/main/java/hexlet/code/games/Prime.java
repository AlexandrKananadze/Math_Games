package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;


public class Prime {

    private static final int rangeRandom = 100;

    private static String generateQuestion(int rand) {
        return "Question: " + rand + "?";
    }

    public static boolean isPrime(int rand) {
        for (int i = 2; i <= rand / 2; i++) {
            if (rand % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Map<String, String> generateTask() {
        Map<String, String> generatedTasks = new HashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ATTEMPTS; i++) {
            int rand = Engine.genRandom(rangeRandom);
            String taskGenerated = generateQuestion(rand);
            generatedTasks.put(taskGenerated, isPrime(rand) ? "yes" : "no");
        }
        return generatedTasks;
    }

    public static void runPrime() {
        String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.execute(task, generateTask());
    }
}



