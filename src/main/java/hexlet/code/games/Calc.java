package hexlet.code.games;


import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Calc {

    private static final char[] OPERATION = {'*', '-', '+'};
    private static final int rangeRandom = 100;

    public static int calculation(int x, int y, char operation) {
        int result;
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
                throw new RuntimeException();
        }
        return result;
    }

    public static char getRandomOperation() {
        Random rnd = new Random();
        return OPERATION[(rnd.nextInt(OPERATION.length))];
    }

    public static String generateQuestion(int x, int y, char operation) {
        return "Question: " + x + " " + operation + " " + y;
    }

    public static Map<String, String> generateTask() {
        Map<String, String> generatedTask = new HashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ATTEMPTS; i++) {
            int x = Engine.genRandom(rangeRandom);
            int y = Engine.genRandom(rangeRandom);
            char operation = getRandomOperation();
            String rightAnswer = String.valueOf(calculation(x, y, operation));
            String taskGenerated = generateQuestion(x, y, operation);
            generatedTask.put(taskGenerated, rightAnswer);
        }
        return generatedTask;
    }

    public static void runCalc() {
        String task = "What is the result of the expression?";
        Engine.execute(task, generateTask());
    }
}
