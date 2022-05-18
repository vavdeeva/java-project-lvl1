package hexlet.code;

import java.util.Scanner;

public class Engine {


    public static String greeting(String rule) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Hello, " + str + "!");

        if (!rule.equals("")) {
            System.out.println(rule);
        }
        return str;
    }

    public static boolean isNotEqualWithRightAnswer(String question, String rightAnswer, String name) {

        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean result = false;

        if (str.equals(rightAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + str + "' is wrong answer ;(. Correct answer was '"
                    + rightAnswer + "'.\nLet's try again, " + name + "!");
            result = true;
        }
        return result;
    }



}
