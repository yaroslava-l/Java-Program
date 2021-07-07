package View;

import java.util.Locale;
import java.util.ResourceBundle;

import static View.TextConstants.*;

/**
 * Created by Yaroslava Levchuk on 05.07.2021.
 */
public class View{

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));
    //new Locale("en"));

    //Utilities methods

    /**
     *
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     *
     * @param message
     * @return
     */
    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String str : message) {
            concatString = concatString.append(str);
        }
        return new String(concatString);
    }

    /**
     *
     * @param message
     */
    public void printInputMessage(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_DATA),
                bundle.getString(message)));
    }
    /**
     *
     * @param message
     */
    public void printShowMessage(String message) {
        printMessage(bundle.getString(OUTPUT_DATA) + message);
    }

    /**
     *
     * @param message
     */
    public void printWrongMessage(String message) {
        printMessage(bundle.getString(WRONG_DATA));
        printInputMessage(message);
    }


}
