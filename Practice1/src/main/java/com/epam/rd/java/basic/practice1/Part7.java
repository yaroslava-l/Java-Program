package com.epam.rd.java.basic.practice1;

public class Part7 {
    public static void main(String[]args) {
        System.out.println("A"+" ==> "+str2int("A")+" ==> "+int2str(1));
        System.out.println("B"+" ==> "+str2int("B")+" ==> "+int2str(2));
        System.out.println("Z"+" ==> "+str2int("Z")+" ==> "+int2str(26));
        System.out.println("AA"+" ==> "+str2int("AA")+" ==> "+int2str(27));
        System.out.println("AZ"+" ==> "+str2int("AZ")+" ==> "+int2str(52));
        System.out.println("BA"+" ==> "+str2int("BA")+" ==> "+int2str(53));
        System.out.println("ZZ"+" ==> "+str2int("ZZ")+" ==> "+int2str(702));
        System.out.println("AAA"+" ==> "+str2int("AAA")+" ==> "+int2str(703));
    }

    public static int str2int(String number) {
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result =result * 26 + number.charAt(i) - 'A' + 1;
        }
        return result;
    }

    public static String int2str(int number) {
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            number--;
            char ch = (char) (number % 26 + 'A' );
            number /= 26;
            result.append(ch);
        }

        result.reverse();
        return result.toString();
    }

    public static String rightColumn(String number) {
        return int2str(str2int(number) + 1);
    }
}
