package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    int[] number = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}