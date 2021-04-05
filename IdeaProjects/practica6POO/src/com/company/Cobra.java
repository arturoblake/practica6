package com.company;

public class Cobra extends Animal{

    public Cobra(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat () {
        System.out.println(name + "esta comiendo ratones");
    }
}