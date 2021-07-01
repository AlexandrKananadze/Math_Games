package hexlet.code.games;


import hexlet.code.Engine;
import java.util.Scanner;

public class Even {

    public static String chetNechet(int a) {
        String rightAnswer = "";
        if (a % 2 != 0) {
            rightAnswer = "no";
        } else {
            rightAnswer = "yes";
        }
      return rightAnswer;
    }

    public static void even() {
       int rand;
       Engine.getName();
       Scanner con = new Scanner(System.in);
       System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

       for (int i = 0; i < Engine.TRY_ATTEMPT_NUMBER;) {
       rand = Engine.genRandom();
       System.out.println("Question:" + rand);
       String answer = con.nextLine();

           if (answer.equalsIgnoreCase(chetNechet(rand))) {
             Engine.correctAnswerOutPut();
               i++;
           }

          if (!answer.equalsIgnoreCase(chetNechet(rand))) {
              Engine.wrongAnswerOutputString(Engine.getUsername(), answer, chetNechet(rand));
              break;
          }
           Engine.winner(i, Engine.getUsername());
       }

   }

}


