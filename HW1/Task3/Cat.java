package Task3;

public class Cat extends Pet {

    public Cat(String model, int age) {
        super(model, age);
    }

    @Override
    public String LuckyPet () {
        return "Кот " + super.getModel() +  " мурлычет!";
    }
}