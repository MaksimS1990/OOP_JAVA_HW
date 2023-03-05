package Task2;

public class Closet {
    public String closet;

    public Closet(String closet) {
        this.closet = closet;
    }

    public String getcloset() {
        return closet;
    }
    public void setcloset(String closet) {
        this.closet = closet;
    }

    public void closetOpenDoor() {
        System.out.println("Дверца у шкафа открывается");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}