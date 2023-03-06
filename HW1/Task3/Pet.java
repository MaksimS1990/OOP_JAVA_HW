package Task3;

public class Pet {

    private String model;

    public Pet(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return this.model;
    }

    public void CallPet(String name) {
        System.out.println(name + " бежит на встречу!");
    }
}
