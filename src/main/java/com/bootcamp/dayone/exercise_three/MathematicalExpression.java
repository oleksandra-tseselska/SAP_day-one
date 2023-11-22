package com.bootcamp.dayone.exercise_three;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@RequiredArgsConstructor
@Log4j2
public class MathematicalExpression {

    public void init() {
        try (Scanner scanner = new Scanner(System.in)) {
            NumbersForMathExpr numbers = new NumbersForMathExpr();

            System.out.print("Enter the first number: ");
            numbers.setNumOne(getNumericValue(scanner));
            System.out.print("Choose operation:  [1] addition [2] subtraction  [3] multiplication  [4] division): ");
            byte operator = getOperator(scanner);
            System.out.print("Enter the second number: ");
            numbers.setNumTwo(getNumericValue(scanner));
            double result = doExpression(numbers, operator);
            log.info("Result is {} ", result);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    private Double getNumericValue(Scanner scanner) {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            throw new IllegalArgumentException("Please enter numeric symbols");
        }

    }

    private byte getOperator(Scanner scanner) throws IllegalArgumentException {
        try {
            byte operator = scanner.nextByte();
            if (operator <= 0 || operator > 4) throw new IllegalArgumentException("Please choose number from 1 to 4");
            return operator;
        } catch (Exception e) {
            throw new IllegalArgumentException("Please enter numeric symbols");
        }
    }

    private double doExpression(NumbersForMathExpr numbers, byte operator) {
        switch (operator) {
            case (1):
                return sum(numbers);
            case (2):
                return subtraction(numbers);
            case (3):
                return multiplication(numbers);
            case (4):
                return division(numbers);
            default:
                throw new IllegalArgumentException("The program only works with the above operators");
        }
    }

    private double sum(NumbersForMathExpr numbers) {
        return numbers.getNumOne() + numbers.getNumTwo();
    }

    private double subtraction(NumbersForMathExpr numbers) {
        return numbers.getNumOne() - numbers.getNumTwo();
    }

    private double division(NumbersForMathExpr numbers) {
        if (numbers.getNumTwo() == 0) throw new IllegalArgumentException("Division by zero is impossible");
        return numbers.getNumOne() / numbers.getNumTwo();
    }

    public double multiplication(NumbersForMathExpr numbers) {
        return numbers.getNumOne() * numbers.getNumTwo();
    }
}
