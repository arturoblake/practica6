package com.company;

public class Lobo extends Animal{

    public Lobo(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat () {
        System.out.println(name + "esta comiendo taquitos");
    }
}
