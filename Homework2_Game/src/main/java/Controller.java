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

        Scanner sc = new Scanner(System.in);

        model.setPrimaryBarrier(GlobalConstants.MIN_BARRIER, GlobalConstants.MAX_BARRIER);
        model.generateNumber();

        view.printMessage(View.INPUT_NUMBER);

        while (model.checkValue(inputIntValueWithScanner(sc)));

        view.printMessage(View.WIN + model.getNumber());
        view.printMessage(View.STATISTICS + model.getUserNumbers());


    }

    private int inputIntValueWithScanner(Scanner sc) {
        int res = 0;
        view.printMessage(getInputIntMessage());
        while (true) {
            // check int-value
            while (!sc.hasNextInt()) {
                view.printMessage(View.INCORRECT_INPUT + getInputIntMessage());
                sc.next();
            }
            // check value into diapason
            if ((res = sc.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.printMessage(View.INCORRECT_INPUT + getInputIntMessage());
                continue;
            }
            break;
        }
        return res;
    }

    private String getInputIntMessage() {
        return view.printMessage(
                View.INPUT_INT_VALUE_IN_RANGE, View.SPACE_SING,
                String.valueOf(model.getMinBarrier()), View.SPACE_SING,
                String.valueOf(model.getMaxBarrier()), View.SPACE_SING);
    }

}
