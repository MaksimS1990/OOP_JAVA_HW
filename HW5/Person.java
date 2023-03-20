package HW5;

public class Person implements Printable {
    
    private String Name;
    private String Surname;
    private String PhoneNumber;

    public Person(String Name, String Surname, String PhoneNumber) {
        this.Name = Name;
        this.Surname = Surname;
        this.PhoneNumber = PhoneNumber;
    }

    public String getName() {
        return this.Name;
    }

    public String setName(String Name) {
        return this.Name = Name;
    }

    public String getSurname() {
        return this.Surname;
    }

    public String setSurname(String Surname) {
        return this.Surname = Surname;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    public String setPhoneNumber(String PhoneNumber) {
        return this.PhoneNumber = PhoneNumber;
    }

    public void print() {
        System.out.println(this.Name + " " + this.Surname + " " + this.PhoneNumber);
    }

    public boolean contains(String str) {
        return this.PhoneNumber.contains(str) || this.Name.contains(str) || this.Surname.contains(str);
    }
}
