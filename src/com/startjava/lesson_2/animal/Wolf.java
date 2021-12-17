package com.startjava.lesson_2.animal;

public class Wolf {

    private String sex = "Male";
    private String alias = "Серый";
    private int weight = 33;
    private int age = 5;
    private String color = "Серый";

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

     public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println(alias + " идет бредет");
    }

    public void sit() {
        System.out.println(alias + " присел на дорожку");
    }

    public String run() {
        return "бежит за добычей";
    }

    public void howl() {
        System.out.println(alias + " воет на луну");
    }

    public void hunt() {
        System.out.println(alias + " выслеживает добычу");
    }
}

