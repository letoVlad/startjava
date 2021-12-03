package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player playerOne;
    Player playerTwo;
    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public void GuessNumberOne() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int hiddenNumberComp = random.nextInt(100) + 1;
        System.out.println("Подсказка: Число компьютера = " + hiddenNumberComp);
        while ((playerOne.getHiddenNumberUser() != hiddenNumberComp || playerTwo.getHiddenNumberUser() != hiddenNumberComp)) {
            while (playerTwo.getHiddenNumberUser() != hiddenNumberComp) {
                System.out.println("Введите цифры");
                playerOne.setHiddenNumberUser(scanner.nextInt());
                if (playerOne.getHiddenNumberUser() > hiddenNumberComp) {
                    System.out.println("Данное число больше того, что загадал компьютер. Ходит игрок " + playerTwo.getNamePlayer());
                    break;
                } else if (playerOne.getHiddenNumberUser() < hiddenNumberComp) {
                    System.out.println("Данное число меньше того, что загадал компьютер. Ходит игрок " + playerTwo.getNamePlayer());
                    break;
                } else {
                    System.out.println(" Поздравляю, число угадано Игроком: " + playerOne.getNamePlayer());
                    return;
                }
            }
            while (playerOne.getHiddenNumberUser() != hiddenNumberComp) {
                System.out.println("Введите цифры");
                playerTwo.setHiddenNumberUser(scanner.nextInt());
                if (playerTwo.getHiddenNumberUser() > hiddenNumberComp) {
                    System.out.println("Данное число больше того, что загадал компьютер. Ходит игрок " + playerOne.getNamePlayer());
                    break;
                } else if (playerTwo.getHiddenNumberUser() < hiddenNumberComp) {
                    System.out.println("Данное число меньше того, что загадал компьютер. Ходит игрок " + playerOne.getNamePlayer());
                    break;
                } else {
                    System.out.println(" Поздравляю, число угадано Игроком: " + playerTwo.getNamePlayer());
                    return;
                }
            }
        }
    }
}







