package Controller;

import Model.NoteBook;
import Model.Record;
import View.View;

import java.util.Scanner;
import View.TextConstants;
import static Controller.RegexContainer.*;

public class InputNote {
    private View view;
    private Scanner sc;

    /**
     * Constructor
     */
    public InputNote(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void addNewNote(NoteBook noteBook) {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String strFirstName = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? FIRST_NAME_UA : FIRST_NAME_EN;
        String strSecondName = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? SECOND_NAME_UA : SECOND_NAME_EN;

        String firstName =
                utilityController.inputStringValueWithScanner
                        (TextConstants.FIRST_NAME, strFirstName);
        String secondName =
                utilityController.inputStringValueWithScanner
                        (TextConstants.SECOND_NAME, strSecondName);
        String nickName = utilityController.inputStringValueWithScanner
                (TextConstants.NICKNAME, RegexContainer.NICKNAME);

        Record record = new Record(firstName, secondName, nickName);
        noteBook.addRecord(record);
    }
}
