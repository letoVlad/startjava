package com.startjava.lesson_1.calculator;

import java.util.Scanner;

public class Calculator { 

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int numberOne = scanner.nextInt();
        System.out.println("Enter the second number:");
        int numberTwo = scanner.nextInt();
        System.out.println("Enter math operation (+, -, *, /, ^, %)");
        String sign = scanner.next();
        
        if (sign.equals("+")) {
            System.out.println(numberOne + numberTwo);
        } else if (sign.equals("-")) {
            System.out.println(numberOne - numberTwo);
        } else if (sign.equals("*")) {
            System.out.println(numberOne - numberTwo);
        } else if (sign.equals("/")) {
            System.out.println(numberOne / numberTwo);
        } else if (sign.equals("^")) {
            int result = numberOne;
            for (int i = 1; i < numberTwo; i++) {
                result *= numberOne;
            }
            System.out.println(result);
        } else if (sign.equals("%")) {
            System.out.println(numberOne % numberTwo);
        }
    }
}