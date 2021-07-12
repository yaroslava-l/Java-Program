package returns;

public class App3 {
    public static void main(String[] args) {
        double d = sqr(10.0);  // sqr - навсегда "повиснет", и
        System.out.println(d); // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
    }

    public static double sqr(double arg) {
        while (true); // Вот тут мы на века "повисли"
    }

    public static double sqrDouble(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg; // ну ладно, вот твой double
        } else {
            while (true);     // а тут "виснем" навсегда
        }
    }

    public static double sqrException(double arg) {
        throw new RuntimeException();
    }
}
