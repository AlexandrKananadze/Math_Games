package hexlet.code.games;

import hexlet.code.Engine;
import java.util.HashMap;
import java.util.Map;


public class Prime {

    static String generationsTask(int rand) {
        return "Question: " + rand + "?";
    }

    public static boolean isPrime(int rand) {
        boolean rightanswer = true;
        for (int i = 2; i <= rand / 2; i++) {
            if (rand % i == 0) {
                rightanswer = false;
                break;
            }
        }
        return rightanswer;
    }

    public static Map<String, String> questionsToAnswersPrime() {
        Map<String, String> generatedTasks = new HashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ATTEMPTS; i++) {
            int rand = Engine.genRandom();
            String taskGenerated = generationsTask(rand);
            generatedTasks.put(taskGenerated, isPrime(rand) ? "yes" : "no");
        }
        return generatedTasks;
    }

    public static void runnerPrime() {
        String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.execute(task, questionsToAnswersPrime());
    }
}



