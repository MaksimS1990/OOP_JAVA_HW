package Task1;

public class Person {
    private String fullName;
    private int age;
    private Gender gender;

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

    public int getAge() {
        return this.age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getGender() {
        if (this.gender != null){
            return this.gender.toString();
        }
        else return null;
            
    }

    public String toString(){
        return String.format("%s, %d, %s", getFullName(), getAge(), getGender());
    }

}