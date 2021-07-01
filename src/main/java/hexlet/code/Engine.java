package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static String username;
    public static final int TRY_ATTEMPT_NUMBER = 3;
    public static final int PROGRESSION_SIZE = 10;
    public static final int PROGRESSION_MIN_SIZE = 5;
    public static final double DELTA_IN_COMPARING_DOUBLES = 0.01;
    public static final int GREETING = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int MATHPROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int EXIT = 0;
    public static final int RANGE_RANDOM = 100;
    public static int inputCheckMenu(int answerInt) {
        int gameNumber;
        if (!(answerInt >= EXIT && answerInt <= PRIME)) {
           gameNumber = answerInt;
        } else {
            gameNumber = 0;
        }
       return gameNumber;
    }





    public static void getName() {
        Scanner console = new Scanner(System.in);
        System.out.println("May i have you name?");
        username = console.nextLine();
        System.out.println("Hello, " + username);
    }

     public static void winner(int i, String name) {
        if (i == TRY_ATTEMPT_NUMBER) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
    public static int genRandom() {
        return (int) (Math.random() * RANGE_RANDOM + 1);
    }
    public static void correctAnswerOutPut() {
        System.out.println("Correct!");
    }
    public static void wrongAnswerOutputString(String name, String userAnswer, String correctAnswer) {
        System.out.println(userAnswer + " is wrong  answer ;(. Correct answer was " + correctAnswer + "!");
        System.out.println("Let's try again, " + name + " !");

    }
    public static void wrongAnswerOutputInt(String name, int userAnswer, int correctAnswer) {
        System.out.println(userAnswer + " is wrong  answer ;(. Correct answer was " + correctAnswer + "!");
        System.out.println("Let's try again, " + name + " !");
    }

    public static String getUsername() {
        return username;
    }
}
