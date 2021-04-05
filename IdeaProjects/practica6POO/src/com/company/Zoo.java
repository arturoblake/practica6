package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    String name;
    public Zoo(String name) {
        this.name = name;
    }
    public void Menu () {
        Scanner comando = new Scanner(System.in);

        boolean salir = false;
        int opcion;

        Animal animal1 = new Pantera("Manolo", 15);
        Animal animal2 = new Lobo("Ramses", 13);
        Animal animal3 = new Cobra("Nir", 3);

        ArrayList<Animal> Lista = new ArrayList<>();

        Lista.add(animal1);
        Lista.add(animal2);
        Lista.add(animal3);

        while (!salir) {
            System.out.println("1) Agregar animal y mostrar");
            System.out.println("2) Eliminar animal");
            System.out.println("3) Mostrar lista");
            System.out.println("4) Salir");

            System.out.println("Escriba la opcion");
            opcion = comando.nextInt();
            comando.nextLine();

            switch (opcion) {
                case 1:

                    System.out.println("ingresa nombre de animal: ");
                    String name = comando.nextLine();

                    System.out.println("Ingresa edad: ");
                    int age = comando.nextInt();
                    comando.nextLine();

                    Animal animal0 = new Animal(name, age);
                    Lista.add(animal0);

                    for (int i = 0; i < Lista.size(); i++) {
                        Animal actual = Lista.get(i);
                        System.out.println("\tNombre: ");
                        System.out.println(actual.name);
                        System.out.println("\tedad: ");
                        System.out.println(actual.age);

                    }
                    break;
                case 2:
                    System.out.println("Que opcion quieres quitar?");
                    int quitar = comando.nextInt();
                    switch (quitar) {
                        case 1:
                            Lista.remove(0);
                            break;
                        case 2:
                            Lista.remove(1);
                            break;
                        case 3:
                            Lista.remove(2);
                            break;
                        case 4:
                            Lista.remove(3);
                            break;
                        case 5:
                            Lista.remove(4);
                            break;
                        case 6:
                            Lista.remove(5);
                            break;
                        case 7:
                            Lista.remove(6);
                            break;
                    }
                    break;
                case 3:
                    for (int i = 0; i < Lista.size(); i++) {
                        Animal actual = Lista.get(i);
                        System.out.print("Nombre: ");
                        System.out.println(actual.name);
                        System.out.print("edad: ");
                        System.out.println(actual.age);
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("solo numeros entre 1 y 4");
            }
        }
    }
}
