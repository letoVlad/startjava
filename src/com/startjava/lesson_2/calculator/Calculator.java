package com.startjava.lesson_2.calculator;

import java.util.Scanner;

public class Calculator {
    static String inputValue; //записываем мат. выражение
    static int numberOne;
    static int numberTwo;
    static char sign;
    static int result;

    public static int calculate() {
        String[] input = inputValue.split(" ");   //создаем массив input и закидываем в него значение из inputValue
        sign = input[1].charAt(0);                      //преобразование из str в char
        numberOne = Integer.parseInt(input[0]);         //преобразование из str в int
        numberTwo = Integer.parseInt(input[2]);         //преобразование из str в int
        switch (sign) {
            case '+' -> result = Math.addExact(numberTwo, numberTwo);
            case '-' -> result = (Math.subtractExact(numberOne, numberTwo));
            case '*' -> result = (numberOne * numberTwo);
            case '/' -> result = (numberOne / numberTwo);
            case '^' -> result = (int) Math.pow(numberOne, numberTwo);
            case '%' -> result = (numberOne % numberTwo);
        }
        return result;
    }
}

