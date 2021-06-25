/**
 * Created by Yaroslava Levchuk on 25.06.2021.
 */
public class View {
    // Text's constants
    public static final String INPUT_WORD = "Input word = ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_SENTENCE = "Sentence = ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndSentence(String message, String sentence){
        System.out.println(message + sentence);
    }
}
