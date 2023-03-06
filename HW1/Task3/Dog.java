package Task3;

public class Dog extends Pet {
    private String name;

    public Dog(String name) {
        super("собака");
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public String LuckyPet1 () {
        return "собака " + this.name + " лает!";
    }
}
