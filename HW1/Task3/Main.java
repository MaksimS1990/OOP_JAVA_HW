package Task3;

import java.util.ArrayList;
//import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        new Human("Серёжа");

        Pet cat = new Cat("Феликс", 3);

        Pet dog = new Dog("Бакс", 4);

        Pet pig = new Pig("Рок", 1);

        ArrayList<Pet> list = new ArrayList<>();
        list.add(cat);
        list.add(pig);
        list.add(dog);

        System.out.println("Ваш неотсортированный список домашних питомцев: ");
        System.out.println(list);
        System.out.println("-".repeat(150));
        System.out.println("Ваш отсортированный список домашних питомцев: ");
        System.out.println(list);
        list.sort(new PetAgeComparator());

        // System.out.println(cat.equals(pig));

        // humen.strokingPet(cat.getModel());
        // System.out.println(cat.LuckyPet());
        // System.out.println("-".repeat(150));

        // humen.strokingPet(dog.getModel());
        // System.out.println(dog.LuckyPet());
        // System.out.println("-".repeat(150));

        // humen.strokingPet(pig.getModel());
        // System.out.println(pig.LuckyPet());
        // System.out.println("-".repeat(150));

        // humen.Calling();
        // cat.CallPet(cat.getModel());
        // System.out.println("-".repeat(150));
        // humen.Calling();
        // dog.CallPet(dog.getModel());
        // System.out.println("-".repeat(150));
        // humen.Calling();
        // pig.CallPet(pig.getModel());
        // System.out.println("-".repeat(150));
        // humen.HumanGoesToTheRivertoSwim();
        // dog.swim();
        // System.out.println();
        // System.out.println("-".repeat(150));
        // humen.HumanGoesToTheRivertoSwim();
        // pig.swim();
    }
    
}