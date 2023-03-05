package Task2;

public class Main {
    public static void main(String[] args) {

        Human humen = new Human("человек");

        Closet closet = new Closet("шкаф");

        System.out.println(humen.getname());
        System.out.println(closet.getcloset());
        humen.humenOpenCloset();
        closet.closetOpenDoor();
    }
}