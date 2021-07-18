package hexlet.code;

import java.util.Map;
import java.util.Scanner;

public class Engine2 {
    public static final int RANGE_RANDOM = 100;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int MATHPROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int NUMBER_OF_ATTEMPS = 3;
    private static String userName = null;

    public static int genRandom() {
        return (int) (Math.random() * RANGE_RANDOM + 1);
    }

    public static void greeting() {
        System.out.println("May I have your name?");
        Scanner console = new Scanner(System.in);
        userName = console.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static void outPutTaskToUser(String taskFromGame) {
        System.out.println(taskFromGame);
        System.out.println("Your answer: ");
    }

    public static String inputAnswerFromUserInt() {
        Scanner console = new Scanner(System.in);
        return String.valueOf(console.nextLine());
    }

    public static boolean isCorrect(String rightUserAnswer, String rightAnswer) {
        return rightAnswer.equals(rightUserAnswer);
    }

    public static void wrongUserAnswerOutput(String rightAnswer, String userAnswer) {
        System.out.println(userAnswer + " is wrong  answer ;(. Correct answer was " + rightAnswer + "!");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static void execute(String task, Map<String, String> threeQuestion) {
        greeting();
        System.out.println(task);
        for (Map.Entry<String, String> questionToAnswer : threeQuestion.entrySet()) {
            outPutTaskToUser(questionToAnswer.getKey());
            String userAnswer = inputAnswerFromUserInt();
            if (isCorrect(userAnswer, questionToAnswer.getValue())) {
                System.out.println("Correct!");
            } else {
                wrongUserAnswerOutput(questionToAnswer.getValue(), userAnswer);
               return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}



