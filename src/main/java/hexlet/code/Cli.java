package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void cli() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner console = new Scanner(System.in);
        String username = console.nextLine();
        System.out.println("Hello, " + username + "!");
    }
}
