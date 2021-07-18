package hexlet.code.games;

import hexlet.code.Engine2;
import java.util.HashMap;
import java.util.Map;


public class Prime1 {

    private static int rand = 0;
    public static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final Map<String, String> GENERATED_TASKS = new HashMap<>();

    public static String generationsTask() {
        rand = Engine2.genRandom();
        return "Question: " + rand + "?";
    }

    public static boolean isPrime() {
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
        for (int i = 0; i < Engine2.NUMBER_OF_ATTEMPS; i++) {
            String task = generationsTask();
            if (isPrime()) {
                GENERATED_TASKS.put(task, "yes");
            } else {
                GENERATED_TASKS.put(task, "no");
            }
        }
        return GENERATED_TASKS;
    }

    public static void runnerPrime() {
        Engine2.execute(TASK, questionsToAnswersPrime());
    }
}



