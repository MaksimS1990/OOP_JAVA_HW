package Task1;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();                      //сравнение людей по возрасту
        //return o1.getFullName().compareTo(o2.getFullName()); //сортировка людей по имени
    }

}
