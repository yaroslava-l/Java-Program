package Controller;

import View.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner sc;
    private View view;

    /**
     * Constructor
     */
    public UtilityController(Scanner sc, View view) {
        this.sc = sc;
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printInputMessage(message);
        while( !(sc.hasNext() && (res = sc.next()).matches(regex))) {
            view.printWrongMessage(message);
        }
        return res;
    }
}
