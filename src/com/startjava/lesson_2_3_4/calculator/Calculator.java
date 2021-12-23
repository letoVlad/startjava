package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    public static int calculate() {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        String[] inputExpression = inputValue.split(" ");
        char sign = inputExpression[1].charAt(0);
        int numberOne = Integer.parseInt(inputExpression[0]);
        int numberTwo = Integer.parseInt(inputExpression[2]);
        int result = 0;
        return switch (sign) {
            case '+' -> Math.addExact(numberTwo, numberTwo);
            case '-' -> Math.subtractExact(numberOne, numberTwo);
            case '^' -> 0;
            case '*' -> result = numberOne * numberTwo;
            case '/' -> result = numberOne / numberTwo;
            case '%' -> result = (numberOne % numberTwo);
            default -> 0;
        };
    }
}

