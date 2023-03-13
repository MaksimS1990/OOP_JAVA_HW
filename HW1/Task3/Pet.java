package Task3;

public abstract class Pet extends livingСreatures {

    private String model;

    public int age;

    public Pet(String model, int age) {
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

    public void setage(int age) {
    }

    public String getAge() {
        return this.getAge();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obg) {
        if (obg == null) {
            return false;
        } else if (this.getClass() != obg.getClass()) {
            return false;
        } else if (this.getModel().equals(((Pet) obg).getModel())) {
            return true;
        } else {
            return false;
        }
    }

    abstract String LuckyPet();
}
