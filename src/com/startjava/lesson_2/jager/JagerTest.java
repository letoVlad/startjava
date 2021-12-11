package com.startjava.lesson_2.jager;

public class JagerTest {
    public static void main(String[] args) {
        Jager jagerOne = new Jager();
        jagerOne.setModelName("Coyote Tango");
        jagerOne.setOrigin("Japan");
        jagerOne.setArmor(4);
        jagerOne.setSpeed(5);
        jagerOne.move();
        jagerOne.pulse();

        Jager jagerTwo = new Jager();
        jagerTwo.setModelName("Cherno Alpha");
        jagerTwo.setOrigin("Russia");
        jagerTwo.setArmor(10);
        jagerTwo.setSpeed(3);
        jagerTwo.move();
        jagerTwo.pulse();
        jagerTwo.rockets();
    }
}