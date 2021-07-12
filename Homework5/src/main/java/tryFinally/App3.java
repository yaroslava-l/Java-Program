package tryFinally;

public class App3 {
    public static void main(String[] args) {
        try {
            return;
        } finally {
            System.err.println("finally");
        }
    }
}
