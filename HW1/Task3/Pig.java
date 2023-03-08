package Task3;

public class Pig extends Pet implements Swimmable {

    public Pig(String model) {
        super(model);
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
