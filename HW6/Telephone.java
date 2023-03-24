package HW6;

public abstract class Telephone {
    
    private String Model;
    private String Number;

    public Telephone(String Model, String Number) {
        this.Model = Model;
        this.Number = Number;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }
    
    public String getNumber() {
        return Number;
    }
    
    public void setNumber(String Number) {
        this.Number = Number;
    }   

}
