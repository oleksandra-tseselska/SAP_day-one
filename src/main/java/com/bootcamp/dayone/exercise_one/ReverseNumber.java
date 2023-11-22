package com.bootcamp.dayone.exercise_one;

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

    public static int  reverseNumberRecWrapper(int number) {
        int output = reverseNumberRec(Math.abs(number), 0);
        return number < 0 ? output * -1 : output;
    }

    private static int reverseNumberRec(int numberToReverse, int recursiveReversedNumber) {

        if (numberToReverse > 0) {
            int mod = numberToReverse % 10;
            recursiveReversedNumber = recursiveReversedNumber * 10 + mod;
            numberToReverse /= 10;
            return reverseNumberRec(numberToReverse, recursiveReversedNumber);
        }

        return recursiveReversedNumber;
    }
}


