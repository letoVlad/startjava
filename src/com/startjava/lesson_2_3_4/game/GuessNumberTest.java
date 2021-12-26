package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        System.out.println("Введите имя первого игрока");
        Player playerOne = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока");
        Player playerTwo = new Player(scanner.nextLine());
        while (!answer.equals("no")) {
            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}