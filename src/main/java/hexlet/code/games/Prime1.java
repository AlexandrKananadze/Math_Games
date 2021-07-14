package hexlet.code.games;

import hexlet.code.Engine2;
import java.util.HashMap;
import java.util.Map;


public class Prime1 {

    private static  int rand = 0;
    public static final String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String generetionTask() {
        rand = Engine2.genRandom();
        return  "Question: " + rand + "?";
    }

    public static String rightAnswerCount() {
        String rightanswer = "yes";
        for (int i = 2; i <= rand / 2; i++) {
            if (rand % i == 0) {
                rightanswer = "no";
                break;
            }
        }
        return rightanswer;
    }

    public static Map<String, String> threeTaskGenerationEven() {
        Map<String, String> threeTask = new HashMap<>();
        for (int i = 0; i < Engine2.TRY_ATTEMPT_NUMBER; i++) {
            threeTask.put(generetionTask(), (rightAnswerCount()));
        }
        return threeTask;
    }

    public static void runnerPrime() {
        Engine2.executeEngineInThisGame(task, threeTaskGenerationEven());
    }
}



