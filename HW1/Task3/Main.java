package Task3;

public class Main {

    public static void main(String[] args) {
        Human humen = new Human("человек");

        Cat cat = new Cat("Барсик");

        System.out.println(humen.getname());
        System.out.println(cat.getname());
        humen.HumenCallCat();
        cat.CatPurrs();
    }
}