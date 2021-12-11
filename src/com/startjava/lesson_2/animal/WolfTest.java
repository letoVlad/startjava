package com.startjava.lesson_2.animal;

public class WolfTest  {   
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.run();
        wolfOne.sit();
        wolfOne.hunt();
        wolfOne.howl();
        wolfOne.go();
        wolfOne.setAlias("Black");
        wolfOne.setAge(5);
        wolfOne.setColor("White");
        wolfOne.setWeight(30);
        System.out.println(wolfOne.getAlias());
        System.out.println(wolfOne.getAge());
        wolfOne.setAge(123);
        System.out.println(wolfOne.getColor());
        System.out.println(wolfOne.getWeight());
    }
}
