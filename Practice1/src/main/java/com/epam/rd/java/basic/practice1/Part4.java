package com.epam.rd.java.basic.practice1;

public class Part4 {
    public static int gcd(int a, int b) {
        return (b==0) ? a : gcd(b,a%b);
    }

    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        System.out.println(gcd(number1, number2));
}


}
