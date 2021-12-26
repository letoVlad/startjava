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
        System.out.println("Подсказка: Число компьютера = " + hiddenNumber);
        System.out.println("У каждого игрока 10 попыток");
        for (int i = 0; i < 10; i++) {
            if (makeMove(i, playerOne)) {
                break;
            }
            if (makeMove(i, playerTwo)) {
                break;
            }
        }
        PrintAttempts(playerOne);
        PrintAttempts(playerTwo);
    }

    private boolean makeMove(int i, Player player) {
        System.out.println(player.getName() + " Введи число ");
        player.setNumber(i, scanner.nextInt());
        if (checkForAttempts(player.getAttempPlayer(), player.getName())) {
            return true;
        }
        if (numberCheck(i, player)) {
            return true;
        }
        return false;
    }

    private boolean numberCheck(int i, Player player) {
        if (player.getNumber(i) > hiddenNumber) {
            System.out.println(player.getName() + " Данное число больше того, что загадал компьютер.");
            player.setAttempPlayer(++i);
        } else if (player.getNumber(i) < hiddenNumber) {
            System.out.println(player.getName() + " Данное число меньше того, что загадал компьютер.");
            player.setAttempPlayer(++i);
        } else if (player.getNumber(i) == hiddenNumber) {
            System.out.println("Игрок: " + player.getName() + " угадал число " + player.getNumber(i) + " c " + player.getAttempPlayer() + " попытки");
            return true;
        }
        return false;
    }

    private boolean checkForAttempts(int attemp, String namePlayer) {
        if (attemp == 10) {
            System.out.println("У " + namePlayer + " закончились попытки");
            return true;
        }
        return false;
    }

    private void PrintAttempts(Player player) {
        System.out.print("Названные игроком " + player.getName() + " числа:");
        for (int nums : player.getNumbersCopy()) {
            System.out.print(nums + " ");
        }
        System.out.println(" ");
    }
}