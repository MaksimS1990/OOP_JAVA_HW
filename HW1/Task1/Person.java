package Task1;

public class Person extends Humanity implements Comparable<Person> {
    public  int age;
    private String fullName;

    public Person(String fullName, int age) {                    // конструктор
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String toString(){
        return String.format("%s (%s)", getFullName(), getAge());
    }

    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();
    }
}