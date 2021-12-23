package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
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
        int attempPlayerOne = 0;
        int attempPlayerTwo = 0;
        Random random = new Random();
        int hiddenNumberComp = random.nextInt(100) + 1;
        System.out.println("Подсказка: Число компьютера = " + hiddenNumberComp);
        System.out.println("У каждого игрока 10 попыток");
        for (int i = 0; i < 10; i++) {
            attempPlayerOne++;
            if (startGame(i, playerOne.number, hiddenNumberComp, attempPlayerOne, playerOne.getName())) {
                break;
            }
            attempPlayerTwo++;
            if (startGame(i, playerTwo.number, hiddenNumberComp, attempPlayerTwo, playerTwo.getName())) {
                break;
            }
        }
        System.out.print("Названные числа игроком " + playerOne.getName() + " ");
        for (int nums : printAttempts(playerOne.number, attempPlayerOne)) {
            System.out.print(nums + " ");
        }
        System.out.println(" ");
        System.out.print("Названные числа игроком " + playerTwo.getName() + " ");
        for (int nums : printAttempts(playerTwo.number, attempPlayerOne)) {
            System.out.print(nums + " ");
        }
        System.out.println(" ");
    }

    public boolean startGame(int i, int[] arrayNumber, int hiddenNumberComp, int attemp, String player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player + " Введи число ");
        arrayNumber[i] = scanner.nextInt();
        if (checkForAttempts(attemp, player)) {
            return true;
        }
        if (arrayNumber[i] > hiddenNumberComp) {
            System.out.println(playerTwo.getName() + " Данное число больше того, что загадал компьютер.");
        } else if (arrayNumber[i] < hiddenNumberComp) {
            System.out.println(playerTwo.getName() + " Данное число меньше того, что загадал компьютер.");
        } else if (arrayNumber[i] == hiddenNumberComp) {
            System.out.println("Игрок: " + playerTwo.getName() + " угадал число " + arrayNumber[i] + " c " + attemp + " попытки");
            return true;
        }
        return false;
    }

    public int[] printAttempts(int[] numbers, int attemp) {
        return Arrays.copyOf(numbers, attemp);
    }

    public boolean checkForAttempts(int attemp, String namePlayer) {
        if (attemp == 10) {
            System.out.println("У " + namePlayer + " закончились попытки");
            return true;
        }
        return false;
    }
}