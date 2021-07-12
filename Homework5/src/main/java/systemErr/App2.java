package systemErr;

public class App2 {
    public static void main(String[] args) {
        System.err.println("sout");
        throw new Error();
    }
}
