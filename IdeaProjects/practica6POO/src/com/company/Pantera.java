package com.company;

public class Pantera extends Animal{

    public Pantera(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat () {
        System.out.println(name + "esta comiendo carne");
    }
}
