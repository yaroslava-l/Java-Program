package returns;

public class App2 {
    public static void main(String[] args) {
        double d = sqr(10.0); // ну, и чему равно d?
        System.out.println(d);
    }
   /* public static double sqr(double arg) {
        // nothing
    }*/

    public static double sqr(double arg) {
        while (true); // Удивительно, но КОМПИЛИРУЕТСЯ!
    }

}
