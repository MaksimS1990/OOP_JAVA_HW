package Task2;

public class Main {
    public static void main(String[] args) {

        Human humen = new Human("человек");

        Closet closet = new Closet("шкаф");

        closet.state = Closet.State.opened;

        humen.opened(closet);
        humen.closed(closet);
        
    }
}