package hexlet.code.games;


import hexlet.code.Engine2;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Calc1 {
    private static int x;
    private static int y;
    private static char operation;
    public static final String TASK = "What is the result of the expression?";
    private static final Map<String, String> GENEREATED_TASKS = new HashMap<>();

    public static double calculation() {
        double result = 0;
        switch (operation) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            default:
                break;
        }
        return result;
    }

    public static char getRandomCharacter() {
        char[] ch1 = {'*', '-', '+'};
        Random rnd = new Random();
        return ch1[(rnd.nextInt(ch1.length))];
    }

    public static String generetionTask() {
        x = Engine2.genRandom();
        y = Engine2.genRandom();
        operation = getRandomCharacter();
        return "Question: " + x + " " + operation + " " + y;
    }

    public static String rightAnswerCount() {
        return String.valueOf((int) calculation());
    }

    public static Map<String, String> questionsToAnswersCalc() {

        for (int i = 0; i < Engine2.NUMBER_OF_ATTEMPS; i++) {
            GENEREATED_TASKS.put(generetionTask(), rightAnswerCount());
        }
        return GENEREATED_TASKS;
    }

    public static void runnerCalc() {
        Engine2.execute(TASK, questionsToAnswersCalc());
    }
}
