package Task2;

public class Human {
    public String name;

    public Human(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void opened(Closet closet){
        if (closet.state == Closet.State.closed) {
            System.out.println(name + " открывает " + closet);
            closet.state = Closet.State.opened;
        } else {
            System.out.println(closet + " открыт!");
        }
    }

     public void closed(Closet closet){
         if (closet.state == Closet.State.opened) {
            System.out.println(name + " закрывает " + closet);
            closet.state = Closet.State.closed;
         } else {
            System.out.println(closet + " закрыт!");
         }
    }
}