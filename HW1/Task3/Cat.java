package Task3;

public class Cat extends Pet {
    private String name;

    public Cat(String name) {
        super("кот");
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public String LuckyPet () {
        return "кот " + this.name +  " мурлычет!";
    }
}
