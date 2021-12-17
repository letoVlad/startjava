package com.startjava.lesson_2.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("no")) {
            System.out.print("Введите математическое выражение(через пробел): ");
            Calculator.inputValue = scanner.nextLine();
            System.out.println(Calculator.calculate());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}
