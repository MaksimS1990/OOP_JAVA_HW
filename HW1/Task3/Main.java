package Task3;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
import java.util.Iterator;
//import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        Human humen = new Human("Серёжа");

        Pet cat = new Cat("Феликс", 3);

        Pet dog = new Dog("Бакс", 6);

        Pet pig = new Pig("Рок", 1);

        ArrayList<Pet> list = new ArrayList<>();
        list.add(cat);
        list.add(pig);
        list.add(dog);

        System.out.println("Список всех Ваших домашних животным: ");                // вывод списка через цикл
        Iterator<Pet> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "!");
        }
        System.out.println("^".repeat(150));

        //ListIterator<Pet> listIterator = list.listIterator();
        System.out.println("Ваш неотсортированный список домашних питомцев: ");
        System.out.println(list);
        System.out.println("-".repeat(150));
        System.out.println("Ваш отсортированный по возрасту список домашних питомцев: ");
        list.sort(new PetAgeComparator());
        System.out.println(list);
        System.out.println("-".repeat(150));

        System.out.println("Ваш новый неотсортированный список домашних питомцев: ");
        ArrayList<Pet> newlist = new ArrayList<>();
        newlist.add(cat);
        newlist.add(pig);
        newlist.add(dog);
        System.out.println(newlist);
        System.out.println("-".repeat(150));
        Collections.sort(newlist, new PetNameComparator());
        System.out.println("Ваш отсортированный по имени список домашних питомцев: ");
        System.out.println(newlist);

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

        // humen.CallingPet();
        // cat.CallPet(cat.getModel());
        // System.out.println("-".repeat(150));
        // humen.CallingPet();
        // dog.CallPet(dog.getModel());
        // System.out.println("-".repeat(150));
        // humen.CallingPet();
        // pig.CallPet(pig.getModel());
        // System.out.println("-".repeat(150));
        // humen.HumanGoesToTheRivertoSwim();
        // dog.swim();
        // System.out.println();
        // System.out.println("-".repeat(150));
        // humen.HumanGoesToTheRivertoSwim();
        //pig.swim();
    }
    
}