package Task1;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 49);
        Person vasya = new Person("Вася", 31);
        Person masha = new Person("Маша", 17);
        Person jane = new Person("Женя", 26);
        Person ivan = new Person("Ваня", 57);
        GeoTree gt = new GeoTree();
        gt.append(irina, Relationship.parent, vasya, Relationship.children);
        gt.append(irina, Relationship.parent, masha, Relationship.children);
        gt.append(irina, Relationship.parent, jane, Relationship.children);
        gt.append(ivan, Relationship.parent, masha, Relationship.children);
        gt.append(ivan, Relationship.parent, vasya, Relationship.children);
        gt.append(ivan, Relationship.parent, jane, Relationship.children);

        gt.append(vasya, Relationship.brother, jane, Relationship.sister);
        gt.append(vasya, Relationship.brother, masha, Relationship.sister);
        gt.append(jane, Relationship.sister, vasya, Relationship.brother);
        gt.append(jane, Relationship.sister, masha, Relationship.sister);

        gt.append(irina, Relationship.wife, ivan, Relationship.husband);

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
