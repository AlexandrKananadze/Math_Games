package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;


public class MathProgression {
    private static final int PROGRESSION_SIZE = 10;
    private static final int PROGRESSION_MIN_SIZE = 5;

    public static String[] hideMathProgression(String[] progression, int indexHide) {
        progression[indexHide] = "*";
        return progression;
    }

    public static String[] generateProgression() {
        String[] progression = new String[(int) ((Math.random() * PROGRESSION_SIZE)
                + PROGRESSION_MIN_SIZE)];
        int d = Engine.genRandom();
        int firstNumber = Engine.genRandom();
        for (int k = 0; k < progression.length; k++) {
            progression[k] = String.valueOf(firstNumber + k * d);
        }
        return progression;
    }

    public static String generationsTask(String[] hideIndexProgression) {
        StringBuilder task = new StringBuilder();
        for (String k : hideIndexProgression) {
            if (k.equals("*")) {
                task.append(".. ");
            } else {
                task.append(k).append(" ");
            }
        }
        return "Question: " + task + "?";
    }

    public static String rightAnswerCount(String valHide) {
        return String.valueOf(valHide);
    }

    public static Map<String, String> questionsToAnswersMath() {
        Map<String, String> generatedTasks = new HashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ATTEMPTS; i++) {
            String[] progression = generateProgression();
            int indexHide = (int) (Math.random() * progression.length - 1);
            String valHide = progression[indexHide];
            String generatedTask = generationsTask(hideMathProgression(progression, indexHide));
            generatedTasks.put(generatedTask, (rightAnswerCount(valHide)));
        }
        return generatedTasks;
    }

    public static void runnerMathProgression() {
        String task = "What number is missing in the PROGRESSION?";
        Engine.execute(task, questionsToAnswersMath());
    }
}
