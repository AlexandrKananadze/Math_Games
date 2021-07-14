package hexlet.code;

import java.util.Map;
import java.util.Scanner;

public class Engine2 {
    private static String userName;
    private static String userAnswer;
    public static final int RANGE_RANDOM = 100;
    public static final int GREETING = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int MATHPROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int EXIT = 0;
    public static final int PROGRESSION_SIZE = 10;
    public static final int PROGRESSION_MIN_SIZE = 5;
    public static final int TRY_ATTEMPT_NUMBER = 3;



   public static int genRandom() {
        return (int) (Math.random() * RANGE_RANDOM + 1);
    }


   public static  void inputUserNameGreeting() {
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
      return   console.nextLine() + "";
   }

   public static boolean checkUserAnswerMatchCorrectAnswer(String rightUserAnswer, String rightAnswer) {
        return rightAnswer.equals(rightUserAnswer);
   }

   public static void rightUserAnswerOutput() {
       System.out.println("Correct!");
   }

   public static void wrongUserAnswerOutput(String rightanswer) {
        System.out.println(userAnswer + " is wrong  answer ;(. Correct answer was " + rightanswer + "!");
        System.out.println("Let's try again, " + userName + "!");
   }

   public static void gameWinner() {
       System.out.println("Congratulations, " + userName + "!");
   }

    public static void  executeEngineInThisGame(String task, Map<String, String> threeQuestion) {
            inputUserNameGreeting();
        int i = 0;
        System.out.println(task);
        for (Map.Entry<String, String> asd: threeQuestion.entrySet()) {
            outPutTaskToUser(asd.getKey());
            boolean a = checkUserAnswerMatchCorrectAnswer(inputAnswerFromUserInt(), asd.getValue());
            if (a) {
                rightUserAnswerOutput();
                i++;
                if (i == TRY_ATTEMPT_NUMBER) {
                    gameWinner();
                    break;
                }
            } else {
                wrongUserAnswerOutput(asd.getValue());
                break;
            }
        }
    }

    public static int inputCheckMenu(int answerInt) {
        int gameNumber;
        if (!(answerInt >= EXIT && answerInt <= PRIME)) {
            gameNumber = answerInt;
        } else {
            gameNumber = 0;
        }
        return gameNumber;
    }


    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        Engine2.userName = userName;
    }
}



