import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("no")) {
            System.out.println("Введите имя первого игрока");
            Player playerOne = new Player(scanner.nextLine());
            System.out.println("Введите имя второго игрока");
            Player playerTwo = new Player(scanner.nextLine());
            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.start();
            answer = "";
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = scanner.nextLine();
            }
        }
    }
}