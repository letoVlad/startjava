package com.startjava.lesson_1.game;

public class MyFirstGame { 

    public static void main(String[] agrs) {
        int startRate = 0;
        int endRate = 100;
        int hiddenNumberComp = 46;
        int playerNumber = 0;

        while (playerNumber != hiddenNumberComp) {
            playerNumber = (startRate + endRate) / 2;
            if (playerNumber < hiddenNumberComp) {
                startRate = playerNumber + 1;
                System.out.println(playerNumber + " Данное число меньше того, что загадал компьютер");
            } else if (playerNumber > hiddenNumberComp) {
                endRate = playerNumber - 1;
                System.out.println(playerNumber + " Данное число больше того, что загадал компьютер");
            }
        }
        System.out.println(playerNumber + " Поздравляю, число угадано!");
    }
}
