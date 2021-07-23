package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;

public class Even {

    private static final int rangeRandom = 100;

    public static String generateQuestion(int rand) {
        return "Question: " + rand + "?";
    }

    public static boolean isEven(int rand) {
        return rand % 2 == 0;
    }

    public static Map<String, String> generateTask() {
        Map<String, String> generatedTasks = new HashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ATTEMPTS; i++) {
            int rand = Engine.genRandom(rangeRandom);
            String taskGenerate = generateQuestion(rand);
            generatedTasks.put(taskGenerate, isEven(rand) ? "yes" : "no");
        }
        return generatedTasks;
    }

    public static void runEven() {
        String task = "Answer 'yes' if given number is even. Otherwise answer 'no'.";
        Engine.execute(task, generateTask());
    }
}

