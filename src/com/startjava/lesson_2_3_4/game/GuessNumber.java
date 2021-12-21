package com.startjava.lesson_2_3_4.game;

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
            for (int i = 0, j = 3; i < playerOne.number.length; i++, j--) {
                System.out.println(playerOne.getName() + " Введи число " + " У тебя " + j + " попытки");
                playerOne.number[i] = scanner.nextInt();
                if (playerOne.number[i] > hiddenNumberComp) {
                    System.out.println(playerOne.getName() + " Данное число больше того, что загадал компьютер." );
                    break;
                }  if (playerOne.number[i] < hiddenNumberComp) {
                    System.out.println(playerOne.getName() + " Данное число меньше того, что загадал компьютер." );
                    break;
                }  if (playerOne.number[i] == hiddenNumberComp) {
                    System.out.println(" Поздравляю, число угадано игроком: " + playerOne.getName() + " угадал число " + playerOne.number[i]);
                    break;
                }
            }
            for (int i = 0; i < playerTwo.number.length; i++) {
                System.out.println(playerTwo.getName() + " Введи число");
                playerTwo.number[i] = scanner.nextInt();
                if (playerTwo.number[i] > hiddenNumberComp) {
                    System.out.println(playerTwo.getName() + " Данное число больше того, что загадал компьютер.");
                } else if (playerTwo.number[i] < hiddenNumberComp) {
                    System.out.println(playerTwo.getName() + " Данное число меньше того, что загадал компьютер.");
                } else if (playerTwo.number[i] == hiddenNumberComp) {
                    System.out.println(" Поздравляю, число угадано игроком: " + playerTwo.getName());
                    break;
                }
            }
        } while (true);
    }
}
