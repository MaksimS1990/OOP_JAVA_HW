package Task3;

public class Dog extends Pet implements Swimmable {

    public Dog(String model) {
        super(model);
    }

    @Override
    public String LuckyPet () {
        return "Пёс " + super.getModel() +  " гавкает!";
    }

    @Override
    public void swim() {
        System.out.printf("Пёс " + super.getModel() + " тоже плавает");
    }
}
