package hexlet.code.games;

import hexlet.code.Engine2;
import java.util.HashMap;
import java.util.Map;


public class MathProgression1 {

    private static int valHide = 0;
    public static final String task = "What number is missing in the PROGRESSION?";
    private static final int[] PROGRESSION = new int[(int) ((Math.random() * Engine2.PROGRESSION_SIZE)
                                                            + Engine2.PROGRESSION_MIN_SIZE)];

    public static int[] hideMathProgression(int[] progression) {
        int indexHide = (int) (Math.random() * progression.length - 1);
        valHide = progression[indexHide];
        progression[indexHide] = 00;
        return progression;
    }
    public static int[]  generateProgression() {
         int d = Engine2.genRandom();
         PROGRESSION[0] = Engine2.genRandom();
         for (int k = 1; k < PROGRESSION.length; k++) {
             PROGRESSION[k] = PROGRESSION[k - 1] + d;
         }
         hideMathProgression(PROGRESSION);
         return PROGRESSION;
    }

    public static String generetionTask() {
        generateProgression();
        StringBuilder task = new StringBuilder();
        for (int k : PROGRESSION) {
            if (k == 00) {
                task.append(".. ");
            } else {
                task.append(k).append(" ");
            }
        }
        return  "Question: " + task + "?";
    }

    public static String rightAnswerCount() {
        return valHide + "";
    }

    public static Map<String, String> threeTaskGenerationEven() {
        Map<String, String> threeTask = new HashMap<>();
        for (int i = 0; i < Engine2.TRY_ATTEMPT_NUMBER; i++) {
            threeTask.put(generetionTask(), (rightAnswerCount()));
        }
        return threeTask;
    }

    public static void runnerMathProgression() {
        Engine2.executeEngineInThisGame(task, threeTaskGenerationEven());
    }
}
