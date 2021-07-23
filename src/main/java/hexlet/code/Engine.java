package hexlet.code;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Engine {
  //  public static final int RANGE_RANDOM = 100;
    public static final int NUMBER_OF_ATTEMPTS = 3;

    public static int genRandom(int rangeRandom) {
        return  new Random().nextInt(rangeRandom) +1;
    }

    public static String greeting() {
        System.out.println("May I have your name?");
        Scanner console = new Scanner(System.in);
        String userName = console.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
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

    public static void wrongUserAnswerOutput(String rightAnswer, String userAnswer, String userName) {
        System.out.println(userAnswer + " is wrong  answer ;(. Correct answer was " + rightAnswer + "!");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static void execute(String task, Map<String, String> questions) {
        String userName = greeting();
        System.out.println(task);
        for (Map.Entry<String, String> questionToAnswer : questions.entrySet()) {
            outPutTaskToUser(questionToAnswer.getKey());
            String userAnswer = inputAnswerFromUserInt();
            if (isCorrect(userAnswer, questionToAnswer.getValue())) {
                System.out.println("Correct!");
            } else {
                wrongUserAnswerOutput(questionToAnswer.getValue(), userAnswer, userName);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}



