package com.company;


public class Veterinarian {
    String name;
    double salary;
    static int vacunados = 0;

    public Veterinarian (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void vaccinate (Animal animal) {
        animal.setVaccinated(true);
        System.out.println(animal.getName () + "lo vacunaron");
        vacunados++;
    }

    public static void cuantasVacunas() {
        System.out.println(vacunados);
    }
}
