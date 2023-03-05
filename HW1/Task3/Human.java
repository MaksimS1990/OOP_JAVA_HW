package Task3;

public class Human {
    public String name;

    public Human(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void HumenCallCat() {
        System.out.println("Человек зовет котика кис-кис....");
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public void humenOpenCloset() {
    }
}