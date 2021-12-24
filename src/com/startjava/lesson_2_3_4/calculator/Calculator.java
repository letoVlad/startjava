package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(String srcExpression) {
        String[] splittedExpression = srcExpression.split(" ");
        char sign = splittedExpression[1].charAt(0);
        int numberOne = Integer.parseInt(splittedExpression[0]);
        int numberTwo = Integer.parseInt(splittedExpression[2]);
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

