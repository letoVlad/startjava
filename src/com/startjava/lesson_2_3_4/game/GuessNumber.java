package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int hiddenNumber = random.nextInt(100) + 1;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        System.out.println("Подсказка: Число компьютера = " + hiddenNumber);
        System.out.println("У каждого игрока 10 попыток");
        for (int i = 0; i < 10; i++) {
            if (makeMove(i, playerOne, hiddenNumber)) {
                break;
            }
            if (makeMove(i, playerTwo, hiddenNumber)) {
                break;
            }
        }
      playerTwo.PrintAttempts();
      playerOne.PrintAttempts();
    }

    public boolean makeMove(int i, Player Player, int hiddenNumber) {
        System.out.println(Player.getName() + "Введи число ");
        Player.setNumber(i, scanner.nextInt());
        if (checkForAttempts(Player.getAttempPlayer(), Player.getName())) {
            return true;
        }
        if (Player.getNumber(i) > hiddenNumber) {
            System.out.println(Player.getName() + " Данное число больше того, что загадал компьютер.");
            Player.setAttempPlayer(++i);
        } else if (Player.getNumber(i) < hiddenNumber) {
            System.out.println(Player.getName() + " Данное число меньше того, что загадал компьютер.");
            Player.setAttempPlayer(++i);
        } else if (Player.getNumber(i) == hiddenNumber) {
            System.out.println("Игрок: " + Player.getName() + " угадал число " + Player.getNumber(i) + " c " + Player.getAttempPlayer() + " попытки");
            return true;
        }
        return false;
    }

    public boolean checkForAttempts(int attemp, String namePlayer) {
        if (attemp == 10) {
            System.out.println("У " + namePlayer + " закончились попытки");
            return true;
        }
        return false;
    }
}