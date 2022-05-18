package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class Calc {

    static final int NUMBER_OF_OPERATIONS = 3;

    public static void runGame() {
        String rule = "What is the result of the expression?";
        String name = Engine.greeting(rule);

        String[] operations = new String[] {"-", "+", "*"};
        boolean hasError = false;

        for (int i = 0; i < Engine.NUMBER_OF_TRY; i++) {
            Random rand = new Random();
            int number1 = rand.nextInt(Engine.MAX_VALUE);
            int number2 = rand.nextInt(Engine.MAX_VALUE);

            Random rand1 = new Random();
            int number3 = rand1.nextInt(1, Calc.NUMBER_OF_OPERATIONS);

            String operation = operations[number3 - 1];

            int result;

            if (operation.equals("+")) {
                result = number1 + number2;
            } else if (operation.equals("-")) {
                result = number1 - number2;
            } else if (operation.equals("*")) {
                result = number1 * number2;
            } else {
                result = 0;
            }

            String rightAnswer = Integer.toString(result);

            String question = number1 + " " + operation + " " + number2;

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
