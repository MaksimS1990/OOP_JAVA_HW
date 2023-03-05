package Task2;

public class Human {
    public String name;

    public Human(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void humenOpenCloset() {
        System.out.println("Человек открывает шкаф");
    }

    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}