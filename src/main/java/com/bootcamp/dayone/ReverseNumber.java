package com.bootcamp.dayone;

public class ReverseNumber {

    private ReverseNumber() {

    }



    public static int reverseWhileLoop(int x) {

        int reversed = 0;

        while (x != 0) {

            int digit = x % 10;

            x /= 10;

            reversed = reversed * 10 + digit;

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {

                return 0;

            }

            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {

                return 0;

            }

        }

        return reversed;

    }



    public static int reverseForLoop(int number) {

        int reversedNumber = 0;

        int numberToReverse = Math.abs(number);



        for (; numberToReverse > 0; numberToReverse /= 10) {

            int mod = numberToReverse % 10;

            reversedNumber = reversedNumber * 10 + mod;

        }



        return reversedNumber;

    }

    public static void main(String[] args) {

        int num = -12345;

        System.out.println(ReverseNumber.reverseWhileLoop(num));

        System.out.println(ReverseNumber.reverseForLoop(num));

    }

}
