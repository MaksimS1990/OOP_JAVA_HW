package Task1;

public class Person {
    private String fullName;

    enum Gender {
        man, wooman
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String toString(){
        return String.format("%s, %d, %s", getFullName());
    }

}