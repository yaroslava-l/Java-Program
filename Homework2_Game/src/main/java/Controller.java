import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controller {

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        int generatedNumber = model.getNumber();
        int min = model.getMinNumber();
        int max = model.getMaxNumber();
        int userNumber;

        Scanner sc = new Scanner(System.in);
        view.printMessage(View.INPUT_NUMBER);

        do {
            userNumber = sc.nextInt();
            model.addUserNumbers(userNumber);

            if (userNumber == generatedNumber) {
                view.printMessage(View.WIN);
                view.printStatistics(View.STATISTICS, model.getUserNumbers());
            } else if (userNumber < generatedNumber && userNumber > min) {
                min = userNumber;
                view.printMessage(View.WRONG_ANSWER);
                view.printMessage(View.INPUT_INT_VALUE_IN_RANGE, min, max);
            } else if (userNumber > generatedNumber && userNumber < max) {
                max = userNumber;
                view.printMessage(View.WRONG_ANSWER);
                view.printMessage(View.INPUT_INT_VALUE_IN_RANGE, min, max);
            } else {
                view.printMessage(View.INCORRECT_INPUT);
                view.printMessage(View.INPUT_INT_VALUE_IN_RANGE, min, max);
            }

        } while (generatedNumber != userNumber);

    }


}
