package Task3;

public abstract class Pet {

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
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    abstract String LuckyPet();
}
