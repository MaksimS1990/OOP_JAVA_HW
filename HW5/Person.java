package HW5;

import java.util.ArrayList;

public class Person implements Printable {
    
    private String Name;
    private String Surname;
    private ArrayList<String> PhoneNumber;

    public Person(String Name, String Surname, String Number) {
        this.Name = Name;
        this.Surname = Surname;
        this.PhoneNumber.add(Number);
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
    StringBuilder sb = new StringBuilder();
        for (String num  : PhoneNumber) {
            sb.append(num + " / ");
        }
        return sb.toString();
    }

    public void setPhoneNumber(String Number) {
        PhoneNumber.add(Number);
    }

    public void print() {
        System.out.println(this.Name + " " + this.Surname + " " + getPhoneNumber());
    }

    public boolean contains(String str) {
        return this.PhoneNumber.contains(str) || this.Name.contains(str) || this.Surname.contains(str);
    }

    // public boolean equals(String str) {                         // пока не придумал для него реализацию
    //     return this.getPhoneNumber() == str;
    // }
}
