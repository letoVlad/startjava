package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    int[] number = new int[9];

    public void setNumber(int[] number) {
        this.number = number;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public int getNumber() {
//        return number;
//    }

//    public void setNumber(int number) {
//        this.number = number;
//    }
}