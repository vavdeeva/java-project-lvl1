package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static void runGame() {
        String rule = "Find the greatest common divisor of given numbers.";
        String name = Engine.greeting(rule);

        boolean hasError = false;

        for (int i = 0; i < Engine.NUMBER_OF_TRY; i++) {
            Random rand = new Random();
            int number1 = rand.nextInt(1, Engine.MAX_VALUE);
            int number2 = rand.nextInt(1, Engine.MAX_VALUE);

            int min = Integer.min(number1, number2);
            int gcd = 1;
            for (int j = 1; j <= min; j++) {
                if (number1 % j == 0 && number2 % j == 0) {
                    gcd = j;
                }
            }

            String rightAnswer = Integer.toString(gcd);

            String question = number1 + " " + number2;

            if (Engine.isNotEqualWithRightAnswer(question, rightAnswer, name)) {
                hasError = true;
                break;
            }
        }

        if (!hasError) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
