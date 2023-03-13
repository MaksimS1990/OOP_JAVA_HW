package Task3;

public class Pig extends Pet implements Swimmable {

    public Pig(String model, int age) {
        super(model, age);
    }

    @Override
    public String LuckyPet () {
        return "Свинка " + super.getModel() +  " хрюкает!";
    }

    @Override
    public void swim() {
        System.out.printf("Свинка " + super.getModel() + " тоже плавает");
    }

}
