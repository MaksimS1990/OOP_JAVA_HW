package Task1;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();                      //сравнение людей по возрасту
        //return o1.getFullName().compareTo(o2.getFullName()); //сортировка людей по имени
    }

}
