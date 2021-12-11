package com.startjava.lesson_2.calculator;

import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("no")) {
            Calculator calculatorOne = new Calculator();
            System.out.println("Введите первое число:");
            calculatorOne.numberOne = scanner.nextInt();
            System.out.println("Введите знак математической операции:");
            calculatorOne.sign = scanner.next().charAt(0);
            System.out.println("Введите второе число:");
            calculatorOne.numberTwo = scanner.nextInt();
            calculatorOne.calculate();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}