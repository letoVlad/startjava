import java.util.Scanner;

public class Calculator {
    public void countingMachine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int numberOne = scanner.nextInt();
        System.out.println("Введите знак математической операции:");
        char sign = scanner.next().charAt(0);
        System.out.println("Введите второе число:");
        int numberTwo = scanner.nextInt();
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

