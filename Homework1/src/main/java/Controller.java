import java.util.Scanner;

/**
 * Created by Yaroslava Levchuk on 25.06.2021.
 */
public class Controller {

    // The Constants
    public static final String HELLO = "Hello";
    public static final String WORLD = "world!";

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setWord(inputWordWithScanner(sc, HELLO));
        model.addWordToSentence();
        model.setWord(inputWordWithScanner(sc, WORLD));
        model.addWordToSentence();

        view.printMessageAndSentence(View.OUR_SENTENCE, model.getSentence());
    }

    //method to controll input data
    public String inputWordWithScanner(Scanner sc, String controlWord) {
        view.printMessage(View.INPUT_WORD);
        String word = sc.next();
        while( ! word.equals(controlWord)) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.INPUT_WORD);
            word = sc.next();
        }

        return word;
    }
}
