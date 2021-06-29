import java.util.List;

public class View {

    public final static String INPUT_NUMBER = "Input INT number: ";
    public static final String INPUT_INT_VALUE_IN_RANGE = "Input INT value in range";
    public final static String INCORRECT_INPUT = "Wrong input! Repeat please!\n";
    public final static String WRONG_ANSWER = "Wrong answer! Try again!\n";
    public final static String WIN = "That's the right number! You win!\n";
    public final static String STATISTICS = "Statistics:";

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printMessage(String message, int param1, int param2) {
        System.out.printf("%s %s - %s.\n ", message, param1, param2);
    }

    public void printStatistics(String message, List<Integer> userNumbers) {
        System.out.printf("%s %s.\n ", message, userNumbers);
    }
}
