package com.startjava.lesson_2.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;

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
            System.out.println(playerOne.getName() + " Введи число");
            playerOne.setNumber(scanner.nextInt());
            if (playerOne.getNumber() > hiddenNumberComp) {
                System.out.println(playerOne.getName() + " Данное число больше того, что загадал компьютер.");
            } else if (playerOne.getNumber() < hiddenNumberComp) {
                System.out.println(playerOne.getName() + " Данное число меньше того, что загадал компьютер.");
            } else if (playerOne.getNumber() == hiddenNumberComp) {
                System.out.println(" Поздравляю, число угадано игроком: " + playerOne.getName());
                break;
            }

            System.out.println(playerTwo.getName() + " Введи число");
            playerTwo.setNumber(scanner.nextInt());
            if (playerTwo.getNumber() > hiddenNumberComp) {
                System.out.println(playerTwo.getName() + " Данное число больше того, что загадал компьютер.");
            } else if (playerTwo.getNumber() < hiddenNumberComp) {
                System.out.println(playerTwo.getName() + " Данное число меньше того, что загадал компьютер.");
            } else if (playerTwo.getNumber() == hiddenNumberComp) {
                System.out.println(" Поздравляю, число угадано игроком: " + playerTwo.getName());
                break;
            }
        } while (true);
    }
}
