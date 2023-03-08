package Task1;

public class Person {
    public  String age;
    private String fullName;

    public Person(String fullName, int age) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String toString(){
        return String.format("%s, %d, %s", getFullName());
    }
}