package hexlet.code;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_ATTEMPTS = 3;

    public static int genRandom(int rangeRandom) {
        return new Random().nextInt(rangeRandom) + 1;
    }

    public static void greeting(String userName) {
        System.out.println("Hello, " + userName + "!");
    }

    public static String userInputName() {
        System.out.println("May I have your name?");
        Scanner console = new Scanner(System.in);
        return console.nextLine();
    }

    public static void printTask(String taskFromGame) {
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

    public static void printFailure(String rightAnswer, String userAnswer, String userName) {
        System.out.println(userAnswer + " is wrong  answer ;(. Correct answer was " + rightAnswer + "!");
        System.out.println("Let's try again, " + userName + "!");
    }


    public static void execute(String task, Map<String, String> questions) {
        String userName = userInputName();
        greeting(userName);
        System.out.println(task);
        for (Map.Entry<String, String> questionToAnswer : questions.entrySet()) {
            printTask(questionToAnswer.getKey());
            String userAnswer = inputAnswerFromUserInt();
            if (isCorrect(userAnswer, questionToAnswer.getValue())) {
                System.out.println("Correct!");
            } else {
                printFailure(questionToAnswer.getValue(), userAnswer, userName);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}



