import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("no")) {
            System.out.println("Введите имя первого игрока");
            Player playerOne = new Player();
            playerOne.setNamePlayer(scanner.nextLine());
            System.out.println("Введите имя второго игрока");
            Player playerTwo = new Player();
            playerTwo.setNamePlayer(scanner.nextLine());
            // Числа
            GuessNumber test = new GuessNumber();
            test.setPlayerOne(playerOne);
            test.setPlayerTwo(playerTwo);
            test.GuessNumberOne();
            answer = "";
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Хотите продолжить игру? [yes/no]");
                answer = scanner.nextLine();
            }
        }
    }
}
