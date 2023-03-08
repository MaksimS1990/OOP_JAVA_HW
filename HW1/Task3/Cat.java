package Task3;

public class Cat extends Pet {

    public Cat(String model) {
        super(model);
    }

    @Override
    public String LuckyPet () {
        return "Кот " + super.getModel() +  " мурлычет!";
    }
}