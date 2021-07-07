package Model;

import View.TextConstants;
import View.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yaroslava Levchuk on 05.07.2021.
 */
public class NoteBook {
    private List<Record> records;
    View view;
    /**
     * Constructor
     */
     public NoteBook() {
         this.records = new ArrayList<>();
         this.view = new View();
     }

     /**
      * Adds record to notebook
      * @param record notebook record
      */
     public void addRecord(Record record) {
         records.add(record);
     }

     // Getters
     public List<Record> getRecords() {
         return records;
     }

     public void showRecords() {
         for(Record r : records) {
             view.printShowMessage(r.getNickName());
         }
     }
}
