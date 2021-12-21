package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    public static int calculate() {
        String inputValue;
        int result = 0;
        int numberOne;
        int numberTwo;
        char sign;
        Scanner scanner = new Scanner(System.in);
        inputValue = scanner.nextLine();
        String[] inputExpression = inputValue.split(" ");
        sign = inputExpression[1].charAt(0);
        numberOne = Integer.parseInt(inputExpression[0]);
        numberTwo = Integer.parseInt(inputExpression[2]);
        switch (sign) {
            case '+' -> result = Math.addExact(numberTwo, numberTwo);
            case '-' -> result = (Math.subtractExact(numberOne, numberTwo));
            case '*' -> result = (numberOne * numberTwo);
            case '/' -> result = (numberOne / numberTwo);
            case '^' -> result = (int) Math.pow(numberOne, numberTwo);
            case '%' -> result = (numberOne % numberTwo);
            default -> System.out.println("Введите математические операции (+, -, *, /, ^, %) ");
        }
        return result;
    }
}

