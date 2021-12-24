package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] number = new int[10];
    private int attempPlayer;

    public void PrintAttempts() {
        System.out.print("Названные игроком " + name + " числа:");
        for (int nums : Arrays.copyOf(number, attempPlayer)) {
            System.out.print(nums + " ");
        }
        System.out.println(" ");
    }

    public int getAttempPlayer() {
        return attempPlayer;
    }

    public void setAttempPlayer(int attempPlayer) {
        this.attempPlayer = ++attempPlayer;
    }

    public int getNumber(int i) {
        return number[i];
    }

    public void setNumber(int index, int value) {
        number[index] = value;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}