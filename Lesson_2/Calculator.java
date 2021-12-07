import java.util.Scanner;

public class Calculator {
    private int numberOne;
    private numberTwo;
    private sign;
    
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

