import java.util.Scanner;

public class Calculator {
    int numberOne = 0;
    int numberTwo = 0;
    char sign = 0;
    public void calculate() {
        switch (sign) {
            case '+':
                System.out.println(numberOne + numberTwo);
                break;
            case '-':
                System.out.println(numberOne - numberTwo);
                break;
            case '*':
                System.out.println(numberOne * numberTwo);
                break;
            case '/':
                System.out.println(numberOne / numberTwo);
                break;
            case '^':
                int result = numberOne;
                for (int i = 1; i < numberTwo; i++) {
                    result *= numberOne;
                }
                break;
            case '%':
                System.out.println(numberOne % numberTwo);
                break;
        }
    }
}

