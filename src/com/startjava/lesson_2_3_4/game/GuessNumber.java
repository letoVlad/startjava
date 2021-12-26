package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private int hiddenNumber = random.nextInt(100) + 1;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        System.out.println("У каждого игрока 10 попыток");
        for (int i = 0; i < 10; i++) {
            if (makeMove(i, playerOne)) {
                break;
            }
            if (makeMove(i, playerTwo)) {
                break;
            }
        }
        printAttempts(playerOne);
        printAttempts(playerTwo);
    }

    private boolean makeMove(int i, Player player) {
        System.out.println(player.getName() + " Введи число ");
        player.setAttemp(i++);
        player.setNumber(i, scanner.nextInt());
        if (haveAnyAttempts(player.getAttemp(), player.getName())) {
            return true;
        }
        if (compareNumbers(i, player)) {
            return true;
        }
        return false;
    }

    private boolean haveAnyAttempts(int attemp, String namePlayer) {
        if (attemp == 10) {
            System.out.println("У " + namePlayer + " закончились попытки");
            return true;
        }
        return false;
    }

    private boolean compareNumbers(int i, Player player) {
        if (player.getNumber(i) == hiddenNumber) {
            System.out.println("Игрок: " + player.getName() + " угадал число " + player.getNumber(i) + " c " + player.getAttemp() + " попытки");
            return true;
        } else if (player.getNumber(i) > hiddenNumber) {
            System.out.println(player.getName() + " Данное число больше того, что загадал компьютер.");
        } else if (player.getNumber(i) < hiddenNumber) {
            System.out.println(player.getName() + " Данное число меньше того, что загадал компьютер.");
        }
        return false;
    }

    private void printAttempts(Player player) {
        System.out.print("Названные игроком " + player.getName() + " числа:");
        for (int num : player.getNumbersCopy()) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }
}