package Task1;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 49);
        Person vasya = new Person("Вася", 31);
        Person masha = new Person("Маша", 17);
        Person jane = new Person("Женя", 26);
        Person ivan = new Person("Ваня", 57);
        Person vera = new Person("Вера", 34);

        GeoTree gt = new GeoTree();
        gt.append(irina, Relationship.parent, vasya, Relationship.children);
        gt.append(irina, Relationship.parent, masha, Relationship.children);
        gt.append(irina, Relationship.parent, jane, Relationship.children);
        gt.append(irina, Relationship.parent, vera, Relationship.children);
        gt.append(ivan, Relationship.parent, masha, Relationship.children);
        gt.append(ivan, Relationship.parent, vasya, Relationship.children);
        gt.append(ivan, Relationship.parent, jane, Relationship.children);
        gt.append(ivan, Relationship.parent, vera, Relationship.children);

        gt.append(vasya, Relationship.brother, jane, Relationship.sister);
        gt.append(vasya, Relationship.brother, masha, Relationship.sister);
        gt.append(vasya, Relationship.sister, vera, Relationship.sister);
        gt.append(jane, Relationship.sister, vasya, Relationship.brother);
        gt.append(jane, Relationship.sister, masha, Relationship.sister);
        gt.append(jane, Relationship.sister, vera, Relationship.sister);
        gt.append(masha, Relationship.sister, vera, Relationship.sister);

        gt.append(irina, Relationship.wife, ivan, Relationship.husband);

        ArrayList<Person> Family = new ArrayList<>();
       
        Family.add(jane);
        Family.add(irina);
        Family.add(ivan);
        Family.add(masha);
        Family.add(vasya);
        Family.add(vera);

        System.out.println("Проверка равенства двух людей из семьи по имени: ");
        System.out.println("-".repeat(150));
        System.out.println(masha.getFullName() == masha.getFullName());
        System.out.println("-".repeat(150));
        System.out.println("Проверка равенства двух людей из семьи по имени: ");
        System.out.println("-".repeat(150));
        System.out.println(masha.getFullName() == vera.getFullName());
        System.out.println("-".repeat(150));

        // System.out.println("Все родственники из Вашей семьи: ");
        // Iterator<Person> iterator = Family.iterator();                  // с помощью итератора бежим по нашей коллекции и все элементы выводим
        // while(iterator.hasNext()) {
        //    System.out.println(iterator.next());
        // }
        System.out.printf("Ваша семья: " + Family);
        System.out.println();
        System.out.println("-".repeat(150));
        System.out.println("-".repeat(150));

        Family.sort(new PersonAgeComparator());                            // сортируем коллекцию при помощи созданного класса Comparator
        // Collections.sort(Family, new PersonNameComparator());           // классический вид вызова сортировки компаратором

        System.out.println("Сравнение двух членов семьи по возрасту: ");
        System.out.println("-".repeat(150));
        System.out.println("Разница в возрасте: " + (irina.compareTo(masha)) + " года");
        System.out.println("-".repeat(150));
        System.out.printf(irina + " старше чем " + masha);
        System.out.println();
        System.out.println("-".repeat(150));

        System.out.printf("Ваша семья, отсортированная по возрасту: " + Family);
        System.out.println();
        System.out.println("-".repeat(150));
        System.out.println("-".repeat(150));

        // ListIterator<Person> listIterator = Family.listIterator();
        // while(listIterator.hasPrevious()) {
        //     System.out.println(listIterator.previous());
        // }



        //for (Person person : Family) {
        //    if (irina.getFullName() != "Ирина")
        //    Family.remove(irina);
        //}

        print(gt, irina, Relationship.parent);
        System.out.println("-".repeat(150));


        print(gt, ivan, Relationship.parent);
        System.out.println("-".repeat(150));

        print(gt, masha, Relationship.children);
        System.out.println("-".repeat(150));

        print(gt, masha, Relationship.sister);
        System.out.println("-".repeat(150));;

        print(gt, irina, Relationship.wife);
        System.out.println("-".repeat(150));

        print(gt, ivan, Relationship.husband);
        System.out.println("-".repeat(150));

        print(gt, SearchAge.younger, 30);
        System.out.println("-".repeat(150));

        print(gt, SearchAge.older, 30);
        System.out.println("-".repeat(150));

        print(gt, SearchAge.younger, 25);
        System.out.println("-".repeat(150));

        print(gt, SearchAge.older, 25);
        System.out.println("-".repeat(150));

    }

        static void print(GeoTree tree, Person name, Relationship re){
        System.out.printf("%s - %s для : ", name, re.toString());
        System.out.println(new Reserch(tree).spend(name,re));
    }

        static void print(GeoTree tree, SearchAge se, int age){
        String st = "";
        if (se == SearchAge.younger) st = "до";
        else if (se == SearchAge.older) st = "от";
        System.out.printf("Все родственники %s %d лет: ", st, age);
        System.out.println(new Reserch(tree).spend(se, age));

    }

}
