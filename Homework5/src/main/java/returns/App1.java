package returns;

public class App1 {
    public double sqr(double arg) { // надо double
        return arg * arg;           // double * double - это double
    }
    public double sqrInt(double arg) { // надо double
        int k = 1;                  // есть int
        return k;                   // можно неявно преобразовать int в double
    }
    public double sqrInt2(double arg) { // надо double
        int k = 1;                  // есть int
        return (double) k;          // явное преобразование int в double
    }

}
