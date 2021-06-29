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
        int userNumber;

        Scanner sc = new Scanner(System.in);
        view.printMessage(View.INPUT_NUMBER);

        do {
            userNumber = sc.nextInt();
            model.addUserNumbers(userNumber);
        } while (!isWin(userNumber, generatedNumber));

    }

    private boolean isWin(int userNumber, int generatedNumber) {
        if (userNumber == generatedNumber){
            view.printMessage(View.WIN);
            view.printStatistics(View.STATISTICS, model.getUserNumbers());
            return true;
        } else {
            changeRange(userNumber);
            view.printMessage(View.WRONG_ANSWER);
            view.printMessage(View.INPUT_INT_VALUE_IN_RANGE, model.getMinNumber(), model.getMaxNumber());
            return false;
        }
    }

    private void changeRange(int userNumber) {
        if(isInputCorrect(userNumber)) {

            if (userNumber < model.getNumber()) {
                model.setMinNumber(userNumber);
            } else {
                model.setMaxNumber(userNumber);
            }
        }
    }

    private boolean isInputCorrect(int number) {
        if(number < model.getMaxNumber() && number > model.getMinNumber()) {
            return true;
        } else {
            view.printMessage(View.INCORRECT_INPUT);
           return false;
        }
    }
}
