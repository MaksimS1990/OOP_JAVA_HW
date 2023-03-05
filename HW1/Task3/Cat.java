package Task3;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void CatPurrs() {
        System.out.println("Барсик бежит к человеку и мурчит!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}