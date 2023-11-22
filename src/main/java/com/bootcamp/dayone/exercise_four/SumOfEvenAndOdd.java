package com.bootcamp.dayone.exercise_four;

import lombok.extern.log4j.Log4j2;

import java.util.InputMismatchException;
import java.util.Scanner;
@Log4j2
public class SumOfEvenAndOdd {
    public static void init() {
        try {
            int n, sumE = 0, sumO = 0;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number of elements in array:");
            n = s.nextInt();
            if (n > 0) {
                int[] a = new int[n];
                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < n; i++) {
                    a[i] = s.nextInt();
                }
                for (int i = 0; i < n; i++) {
                    if (a[i] % 2 == 0) {
                        sumE = sumE + a[i];
                    } else {
                        sumO = sumO + a[i];
                    }
                }
                System.out.println("Sum of Even Numbers:" + sumE);
                System.out.println("Sum of Odd Numbers:" + sumO);
            } else {
                log.error("The array size must be positive number grader that 0");
            }
        } catch (InputMismatchException mismatchException) {
            log.error("Please, use integers. The number must be between  2147483647 and -2147483648. The array size must be positive number");
        } catch (NegativeArraySizeException arraySizeException) {
            log.error("The array size must be positive number grader that 0");
        } catch (Exception e) {
            log.error("Something went wrong. Please try again");
        }
    }
}
