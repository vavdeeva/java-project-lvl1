package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {

    static final int MAX_PLACE = 9;
    public static void runGame() {
        String rule = "What number is missing in the progression?";
        String name = Engine.greeting(rule);

        boolean hasError = false;

        for (int i = 0; i < Engine.NUMBER_OF_TRY; i++) {
            Random rand = new Random();
            int indexPlace = rand.nextInt(1, Progression.MAX_PLACE);
            int numberInProgression = rand.nextInt(1, Engine.MAX_VALUE);
            int increment = rand.nextInt(1, Engine.MAX_VALUE);

            String question = "";

            int lostNumber = 0;

            for (int j = 0; j <= Progression.MAX_PLACE; j++) {
                String nextElement = Integer.toString(numberInProgression);
                if (j == indexPlace) {
                    lostNumber = numberInProgression;
                    nextElement = "..";
                }
                question = question + " " + nextElement;
                numberInProgression += increment;
            }

            String rightAnswer = Integer.toString(lostNumber);

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
