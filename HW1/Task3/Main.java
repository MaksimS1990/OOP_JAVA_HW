package Task3;

public class Main {

    public static void main(String[] args) {
        Human humen = new Human("Серёжа");

        Cat cat = new Cat("Феликс", 2);

        Dog dog = new Dog("Бакс", 3);

        Pig pig = new Pig("Рок", 5);

        // System.out.println(cat.equals(pig));

        humen.strokingPet(cat.getModel());
        System.out.println(cat.LuckyPet());
        System.out.println("-".repeat(150));

        humen.strokingPet(dog.getModel());
        System.out.println(dog.LuckyPet());
        System.out.println("-".repeat(150));

        humen.strokingPet(pig.getModel());
        System.out.println(pig.LuckyPet());
        System.out.println("-".repeat(150));

        humen.Calling();
        cat.CallPet(cat.getModel());
        System.out.println("-".repeat(150));
        humen.Calling();
        dog.CallPet(dog.getModel());
        System.out.println("-".repeat(150));
        humen.Calling();
        pig.CallPet(pig.getModel());
        System.out.println("-".repeat(150));
        humen.HumanGoesToTheRivertoSwim();
        dog.swim();
        System.out.println();
        System.out.println("-".repeat(150));
        humen.HumanGoesToTheRivertoSwim();
        pig.swim();
    }
    
}