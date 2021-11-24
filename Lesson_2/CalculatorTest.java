import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (answer.equals("yes")){
            Calculator calculatorOne = new Calculator();
            calculatorOne.countingMachine();
            answer = "";
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = scanner.nextLine();
            }
        }
    }
}