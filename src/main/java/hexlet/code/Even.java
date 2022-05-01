package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    static final int NUMBER_OF_TRY = 3;
    static final int MAX_VALUE = 100;
    public static void even() {
        String name = Greeting.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < NUMBER_OF_TRY; i++) {
            Random rand = new Random();
            int number = rand.nextInt(MAX_VALUE);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String rightAnswer = "no";
            if (number % 2 == 0) {
                rightAnswer = "yes";
            }

            if (str.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + str + "' is wrong answer ;(. Correct answer was '"
                                    + rightAnswer + "'.\nLet's try again, " + name + "!");
                break;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }

}
