package hexlet.code.games;


import hexlet.code.Engine;

import java.util.Scanner;

public class MathProgression {
    private static int valHide = 0;

    public static int[] hideMathProgression(int[] progression) {
       int indexHide = (int) (Math.random() * progression.length - 1);
       valHide = progression[indexHide];
       progression[indexHide] = 00;
       return progression;
    }

    public static void mathProg() {
        Engine.getName();
        Scanner con = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < Engine.TRY_ATTEMPT_NUMBER;) {
        int[] progression = new int[(int) ((Math.random() * Engine.PROGRESSION_SIZE) + Engine.PROGRESSION_MIN_SIZE)];
        int d = Engine.genRandom();
        progression[0] = Engine.genRandom();

        for (int k = 1; k < progression.length; k++) {
             progression[k] = progression[k - 1] + d;
        }
        hideMathProgression(progression);

            System.out.print("Question:");
            for (int k : progression) {
                if (k == 00) {
                    System.out.print("* ");
                } else {
                    System.out.print(k + " ");
                }
            }
            System.out.println("You answer: ");
            int answer =  con.nextInt();
            if (answer == valHide) {
              Engine.correctAnswerOutPut();
                i++;
            } else {
                Engine.wrongAnswerOutputInt(Engine.getUsername(), answer, valHide);
                break;
            }
            Engine.winner(i, Engine.getUsername());
        }
    }
}
