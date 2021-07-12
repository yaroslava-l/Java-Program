package tryFinally;

public class App6 {
    public static void main(String[] args) {
        try {
            System.err.println("try");
            //Трюк с «if (true) {...}» требуется, так как иначе компилятор обнаруживает недостижимый код
            // (последняя строка) и отказывается его компилировать
            if (true) {throw new RuntimeException();}
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }
}
