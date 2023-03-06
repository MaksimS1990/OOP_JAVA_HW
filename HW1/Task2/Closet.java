package Task2;

public class Closet {
    public String closet;
    private String item;
    public  State state;

    public String getcloset() {
        return closet;
    }
    public void setcloset(String closet) {
        this.closet = closet;
    }


    public Closet (String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return this.item;
    }

    enum State {
        opened, closed
    }

}