package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {

    public static char getRandomCharacter() {
       char[] ch1 = {'*', '-', '+'};
       Random rnd = new Random();
       return ch1[(rnd.nextInt(ch1.length))];
    }

    public static double calculation(int x, int y, char randomOperation) {
            double result = 0;
            switch (randomOperation) {
        case '+':
            result = x  + y;
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

    public static void calc() {
        Engine.getName();
        Scanner con = new Scanner(System.in);
        System.out.println("What is the result of the expression?");

       for (int i = 0; i < Engine.TRY_ATTEMPT_NUMBER;) {
           int x = Engine.genRandom();
           int y = Engine.genRandom();
           char operation = getRandomCharacter();
            System.out.println("Question: " + x + " " + operation + " " + y);
            System.out.println("Your answer: ");
            double res = con.nextInt();

            if (Math.abs(res - calculation(x, y, operation)) < Engine.DELTA_IN_COMPARING_DOUBLES) {
                Engine.correctAnswerOutPut();
                i++;
            }
            if (Math.abs(res - calculation(x, y, operation)) > Engine.DELTA_IN_COMPARING_DOUBLES) {
                Engine.wrongAnswerOutputInt(Engine.getUsername(), (int) res, (int) calculation(x, y, operation));
                break;
            }
           Engine.winner(i, Engine.getUsername());
       }
    }
}
