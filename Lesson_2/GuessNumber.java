import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player playerOne;
    Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int hiddenNumberComp = random.nextInt(100) + 1;
        System.out.println("Подсказка: Число компьютера = " + hiddenNumberComp);

        do {
            System.out.println(playerOne.getNamePlayer() + " Введи число");
            playerOne.setHiddenNumberUser(scanner.nextInt());
            if (playerOne.getHiddenNumberUser() > hiddenNumberComp) {
                System.out.println(playerOne.getNamePlayer() + " Данное число больше того, что загадал компьютер.");
            }
            if (playerOne.getHiddenNumberUser() < hiddenNumberComp) {
                System.out.println(playerOne.getNamePlayer() + " Данное число меньше того, что загадал компьютер.");
            }
            if (playerOne.getHiddenNumberUser() == hiddenNumberComp) {
                System.out.println(" Поздравляю, число угадано Игроком: " + playerOne.getNamePlayer());
                break;
            }
            System.out.println(playerTwo.getNamePlayer() + " Введи число");
            playerTwo.setHiddenNumberUser(scanner.nextInt());
            if (playerTwo.getHiddenNumberUser() > hiddenNumberComp) {
                System.out.println(playerTwo.getNamePlayer() + " Данное число больше того, что загадал компьютер.");
            }
            if (playerTwo.getHiddenNumberUser() < hiddenNumberComp) {
                System.out.println(playerTwo.getNamePlayer() + " Данное число меньше того, что загадал компьютер.");
            }
            if (playerTwo.getHiddenNumberUser() == hiddenNumberComp) {
                System.out.println(" Поздравляю, число угадано Игроком: " + playerTwo.getNamePlayer());
                break;
            }
        } while (playerOne.getHiddenNumberUser() != hiddenNumberComp || playerTwo.getHiddenNumberUser() != hiddenNumberComp);
    }
}







