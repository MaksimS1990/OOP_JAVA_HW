package Task3;

public class Dog extends Pet implements Swimmable {

    public Dog(String model, int age) {
        super(model, age);
    }

    @Override
    public String LuckyPet () {
        return "Пёс " + super.getModel() +  " гавкает!";
    }

    @Override
    public void swim() {
        System.out.printf(super.getModel() + " тоже плавает");

    }

}
