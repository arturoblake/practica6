package com.company;

public class Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    String name;
    int age;
    boolean vaccinated;

    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat () {
        System.out.println(name + "esta comiendo");
    }

    public void sleep () {
        System.out.println(name + "esta durmiendo");
    }
}
