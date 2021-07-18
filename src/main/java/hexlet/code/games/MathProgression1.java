package hexlet.code.games;

import hexlet.code.Engine2;
import java.util.HashMap;
import java.util.Map;


public class MathProgression1 {
    private static final int PROGRESSION_SIZE = 10;
    private static final int PROGRESSION_MIN_SIZE = 5;
    private static String valHide = "";
    public static final String TASK = "What number is missing in the PROGRESSION?";
    private static final Map<String, String> GENERATED_TASKS = new HashMap<>();

    public static String[] hideMathProgression(String[] progression) {
        int indexHide = (int) (Math.random() * progression.length - 1);
        valHide = progression[indexHide];
        progression[indexHide] = "*";
        return progression;
    }

    public static String[] generateProgression() {
        String[] progression = new String[(int) ((Math.random() * PROGRESSION_SIZE)
                + PROGRESSION_MIN_SIZE)];
        int d = Engine2.genRandom();
        int firstNumber = Engine2.genRandom();
        for (int k = 0; k < progression.length; k++) {
            progression[k] = String.valueOf(firstNumber + k * d);
        }
        hideMathProgression(progression);
        return progression;
    }

    public static String generationsTask() {
        generateProgression();
        StringBuilder task = new StringBuilder();
        for (String k : generateProgression()) {
            if (k.equals("*")) {
                task.append(".. ");
            } else {
                task.append(k).append(" ");
            }
        }
        return "Question: " + task + "?";
    }

    public static String rightAnswerCount() {
        return String.valueOf(valHide);
    }

    public static Map<String, String> questionsToAnswersMath() {
        for (int i = 0; i < Engine2.NUMBER_OF_ATTEMPS; i++) {
            GENERATED_TASKS.put(generationsTask(), (rightAnswerCount()));
        }
        return GENERATED_TASKS;
    }

    public static void runnerMathProgression() {
        Engine2.execute(TASK, questionsToAnswersMath());
    }
}
