package hexlet.code.games;

import hexlet.code.Engine2;
import java.util.HashMap;
import java.util.Map;

public class Even1 {

    private static final Map<String, String> GENERATED_TASKS = new HashMap<>();
    private static int rand;
    private static final String TASK = "Answer 'yes' if given number is even. Otherwise answer 'no'.";

    public static String generetionTask() {
        rand = Engine2.genRandom();
        return "Question: " + rand + "?";
    }

    public static boolean isEven() {
        return rand % 2 == 0;
    }

    public static Map<String, String> questionsToAnswersEven() {
        for (int i = 0; i < Engine2.NUMBER_OF_ATTEMPS; i++) {
            String task = generetionTask();
            if (isEven()) {
                GENERATED_TASKS.put(task, "yes");
            } else {
                GENERATED_TASKS.put(task, "no");
            }
        }
        return GENERATED_TASKS;
    }

    public static void runnerEven() {
        Engine2.execute(TASK, questionsToAnswersEven());
    }
}

