package Task1;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 55);
        Person vasya = new Person("Вася", 57);
        Person masha = new Person("Маша", 24);
        Person jane = new Person("Женя", 19);
        Person ivan = new Person("Ваня", 25);
        GeoTree gt = new GeoTree();
        gt.append(irina, Relationship.parent, vasya, Relationship.children);
        gt.append(irina, Relationship.parent, masha, Relationship.children);
        gt.append(irina, Relationship.parent, jane, Relationship.children);
        gt.append(ivan, Relationship.parent, masha, Relationship.children);
        gt.append(ivan, Relationship.parent, vasya, Relationship.children);
        gt.append(ivan, Relationship.parent, jane, Relationship.children);

        gt.append(vasya, Relationship.sisterbrother, jane, Relationship.sisterbrother);
        gt.append(vasya, Relationship.sisterbrother, masha, Relationship.sisterbrother);
        gt.append(jane, Relationship.sisterbrother, vasya, Relationship.sisterbrother);
        gt.append(jane, Relationship.sisterbrother, masha, Relationship.sisterbrother);

        gt.append(irina, Relationship.husbandwife, ivan, Relationship.husbandwife);

        System.out.println("У Ирины дети: ");
        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));
        System.out.println("-".repeat(150));

        System.out.println("У Ивана дети: ");
        System.out.println(new Reserch(gt).spend(ivan,
                Relationship.parent));
        System.out.println("-".repeat(150));

        System.out.println("Родители Маши: ");
        System.out.println(new Reserch(gt).spend(masha,
                Relationship.children));
        System.out.println("-".repeat(150));

        System.out.println("Братья и сёстры Маши: ");
        System.out.println(new Reserch(gt).spend(masha,
                Relationship.sisterbrother));
        System.out.println("-".repeat(150));

        System.out.println("Муж Ирины: ");
        System.out.println(new Reserch(gt).spend(irina,
                Relationship.husbandwife));
        System.out.println("-".repeat(150));

        System.out.println("Жена Ивана: ");
        System.out.println(new Reserch(gt).spend(ivan,
                Relationship.husbandwife));

    }

}