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
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                answer = scanner.nextLine();
            } while ((!answer.equals("yes") && !answer.equals("no")));
        }
    }
}
