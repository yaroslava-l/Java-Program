package com.epam.rd.java.basic.practice1;

public class Part6 {

    private static boolean isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] primeNumber = new int[n];
        int number = 2;
        int count = 0;

        if(n!=0) {
            primeNumber[0] = number;
            number++;
            count++;
        }

        while (count < n) {
            if (isPrime(number)) {
                primeNumber[count] = number;
                count++;
            }
            number = number + 2;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(primeNumber[i]);
            if (i == (n - 1)) {
                break;
            }
            System.out.print(" ");
        }

    }

}
