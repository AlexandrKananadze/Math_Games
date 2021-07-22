package hexlet.code.games;

import hexlet.code.Engine;
import java.util.HashMap;
import java.util.Map;

public class Even {

    public static String generetionTask(int rand) {
        return "Question: " + rand + "?";
    }

    public static boolean isEven(int rand) {
        return rand % 2 == 0;
    }

    public static Map<String, String> questionsToAnswersEven() {
        Map<String, String> generatedTasks = new HashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ATTEMPTS; i++) {
            int rand = Engine.genRandom();
            String taskGenereated = generetionTask(rand);
            generatedTasks.put(taskGenereated, isEven(rand) ? "yes" : "no");
        }
        return generatedTasks;
    }

    public static void runnerEven() {
        String task = "Answer 'yes' if given number is even. Otherwise answer 'no'.";
        Engine.execute(task, questionsToAnswersEven());
    }
}

