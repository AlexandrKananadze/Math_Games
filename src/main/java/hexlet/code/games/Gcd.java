package hexlet.code.games;

import hexlet.code.Engine;
import java.util.HashMap;
import java.util.Map;


public class Gcd {

  public static int countGcd(int first, int second) {
      if (second == 0) {
          return first;
      }
      return countGcd(second, first % second);
  }

    public static String generationTask(int a, int b) {
        return "Question: " + a + " " + b + "?";
    }

    public static String rightAnswerCount(int a, int b) {
        return String.valueOf(countGcd(b, a % b));
    }

    public static Map<String, String> questionsToAnswersGCD() {
        Map<String, String> generatedTasks = new HashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ATTEMPTS; i++) {
            int a = Engine.genRandom();
            int b = Engine.genRandom();
            generatedTasks.put(generationTask(a, b), (rightAnswerCount(a, b)));
        }
        return generatedTasks;
    }

    public static void runnerGCD() {
        String task = "Find the greatest common divisor of given numbers";
        Engine.execute(task, questionsToAnswersGCD());
    }
}
