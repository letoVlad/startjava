package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempPlayer() {
        return countAttempts;
    }

    public void setAttempPlayer(int attempPlayer) {
        this.countAttempts = ++attempPlayer;
    }

    public int[] getNumbersCopy() {
        return Arrays.copyOf(numbers, countAttempts);
    }

    public int getNumber(int i) {
        return numbers[i];
    }

    public void setNumber(int index, int value) {
        numbers[index] = value;
    }
}