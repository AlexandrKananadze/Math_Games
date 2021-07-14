package hexlet.code.games;

import hexlet.code.Engine2;
import java.util.HashMap;
import java.util.Map;

public class Even1 {


    private static int rand;

    //  Генерирует задание
    //  Вычисляет правильный ответ
    //  Вызывает общую логику, передавая ей задание и правильный ответ


    public static String generetionTask() {
        rand = Engine2.genRandom();
        return  "Answer 'yes' if given number is even. Otherwise answer 'no'." + '\n' + "Question: " + rand + "?";
    }

    public static String rightAnswerCount() {
        if (rand % 2 != 0) {
            return "no";
        }
        return "yes";
    }

    public static Map<String, String> threeTaskGenerationEven() {
        Map<String, String> threeTask = new HashMap<>();
        for (int i = 0; i < Engine2.TRY_ATTEMPT_NUMBER; i++) {
            threeTask.put(generetionTask(), (rightAnswerCount()));
        }
    return threeTask;
    }

     public static void runnerEven() {
           Engine2.executeEngineInThisGame(threeTaskGenerationEven());
    }
}

