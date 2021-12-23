package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    public static int calculate() {
        Scanner scanner = new Scanner(System.in);
        String inputValueMath = scanner.nextLine();
        String[] inputExpressionArray = inputValueMath.split(" ");
        char sign = inputExpressionArray[1].charAt(0);
        int numberOne = Integer.parseInt(inputExpressionArray[0]);
        int numberTwo = Integer.parseInt(inputExpressionArray[2]);
        return switch (sign) {
            case '+' -> Math.addExact(numberTwo, numberTwo);
            case '-' -> Math.subtractExact(numberOne, numberTwo);
            case '^' -> (int) Math.pow(numberOne, numberTwo);
            case '*' -> numberOne * numberTwo;
            case '/' -> numberOne / numberTwo;
            case '%' -> numberOne % numberTwo;
            default -> 0;
        };
    }
}

