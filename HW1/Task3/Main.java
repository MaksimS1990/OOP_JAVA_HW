package Task3;

public class Main {

    public static void main(String[] args) {
        Human humen = new Human("Серёжа");

        Cat cat = new Cat("Феликс");

        Dog dog = new Dog("Бакс");

        Pig pig = new Pig("Рок");

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
        humen.HumenGoesToTheRivertoSwim();
        dog.swim();
        System.out.println();
        System.out.println("-".repeat(150));
        humen.HumenGoesToTheRivertoSwim();
        pig.swim();
    }
    
}