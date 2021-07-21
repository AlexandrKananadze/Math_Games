package hexlet.code.games;


import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Calc {
    private static final char[] OPERATION = {'*', '-', '+'};

    public static double calculation(int x, int y, char operation) {
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
        Random rnd = new Random();
        return OPERATION[(rnd.nextInt(OPERATION.length))];
    }

    public static String generationTask(int x, int y, char operation) {
        return "Question: " + x + " " + operation + " " + y;
    }

    public static Map<String, String> questionsToAnswersCalc() {
        Map<String, String> generatedTask = new HashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ATTEMPTS; i++) {
            int x = Engine.genRandom();
            int y = Engine.genRandom();
            char operation = getRandomCharacter();
            String rightAnswer = String.valueOf((int) calculation(x, y, operation));
            generatedTask.put(generationTask(x, y, operation), rightAnswer);
        }
        return generatedTask;
    }

    public static void runnerCalc() {
        String task = "What is the result of the expression?";
        Engine.execute(task, questionsToAnswersCalc());
    }
}
