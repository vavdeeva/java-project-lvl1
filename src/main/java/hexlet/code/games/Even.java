package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void runGame() {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String name = Engine.greeting(rule);

        boolean hasError = false;

        for (int i = 0; i < Engine.NUMBER_OF_TRY; i++) {
            Random rand = new Random();
            int number = rand.nextInt(Engine.MAX_VALUE);

            String question = Integer.toString(number);

            String rightAnswer = "no";
            if (number % 2 == 0) {
                rightAnswer = "yes";
            }

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
