package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static void runGame() {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String name = Engine.greeting(rule);

        boolean hasError = false;

        for (int i = 0; i < Engine.NUMBER_OF_TRY; i++) {
            Random rand = new Random();
            int primeNumber = rand.nextInt(1, Engine.MAX_VALUE);

            int temp = 0;

            String rightAnswer = "yes";

            for (int j = 2; j <= primeNumber / 2; j++) {
                temp = primeNumber % j;
                if (temp == 0) {
                    rightAnswer = "no";
                    break;
                }
            }

            String question = Integer.toString(primeNumber);

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
