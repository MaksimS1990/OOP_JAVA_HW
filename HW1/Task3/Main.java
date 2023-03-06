package Task3;

public class Main {

    public static void main(String[] args) {
        Human humen = new Human("Серёжа");

        Cat cat = new Cat("Феликс");

        Dog dog = new Dog("Бакс");

        humen.strokingPet(cat.getname());
        System.out.println(cat.LuckyPet());
        System.out.println();

        humen.strokingPet(dog.getname());
        System.out.println(dog.LuckyPet1());
        System.out.println();

        humen.Calling();
        cat.CallPet(cat.getname());
        dog.CallPet(dog.getname());
    }
}