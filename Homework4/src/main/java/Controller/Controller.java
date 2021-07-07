package Controller;

import Model.Model;
import Model.Record;
import Model.NoteBook;
import View.View;

import View.TextConstants;
import java.util.Scanner;

/**
 * Created by Yaroslava Levchuk on 05.07.2021.
 */
public class Controller {
    private Model model;
    private View view;

    /**
     * Constructor
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNote inputNewNote = new InputNote(view, sc);
        NoteBook noteBook = new NoteBook();
        inputNewNote.addNewNote(noteBook);
        noteBook.showRecords();

    }

}
