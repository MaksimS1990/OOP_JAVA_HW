package Task3;

public class Human {
    public String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void strokingPet(String name) {
        System.out.println(this.name + " гладит " + name + "а");
    }

    public void Calling() {
        System.out.println(this.name + " зовёт своего питомца!");
    }

}