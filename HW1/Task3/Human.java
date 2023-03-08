package Task3;

public class Human implements GoesToTheRivertoSwim {
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

    @Override
    public void HumanGoesToTheRivertoSwim() {
        System.out.println(this.name + " пошёл плавать и взял своего питомца");
    }

    public void Calling() {
    }

}