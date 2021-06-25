package com.epam.rd.java.basic.practice1;

public class Part3 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        for (String arg : args) {
            result.append(arg+" ");
        }
        result.setLength(result.length() - 1);
        System.out.print(result);
    }
}
