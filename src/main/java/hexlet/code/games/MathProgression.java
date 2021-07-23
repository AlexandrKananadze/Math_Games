package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;


public class MathProgression {

    private static final int PROGRESSION_MAX_SIZE = 10;
    private static final int PROGRESSION_MIN_SIZE = 5;
    private static final int RANGE_RANDOM = 100;

    public static String[] generateProgression() {
        String[] progression = new String[(int) ((Math.random()
                * PROGRESSION_MAX_SIZE) + PROGRESSION_MIN_SIZE)];
        int d = Engine.genRandom(RANGE_RANDOM);
        int firstNumber = Engine.genRandom(RANGE_RANDOM);
        for (int k = 0; k < progression.length; k++) {
            progression[k] = String.valueOf(firstNumber + k * d);
        }
        return progression;
    }

    public static String generateQuestion(String[] progression) {
        String task = String.join(" ", progression);
        return "Question: " + task + "?";
    }

    public static Map<String, String> generateTask() {
        Map<String, String> generatedTasks = new HashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ATTEMPTS; i++) {
            String[] progression = generateProgression();
            int indexHide = (int) (Math.random() * progression.length - 1);
            String valHide = progression[indexHide];
            progression[indexHide] = ".. ";
            generatedTasks.put(generateQuestion(progression), valHide);
        }
        return generatedTasks;
    }

    public static void runMathProgression() {
        String task = "What number is missing in the PROGRESSION?";
        Engine.execute(task, generateTask());
    }
}
