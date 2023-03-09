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

        System.out.print("У Ирины дети: ");
        System.out.println(new Reserch(gt).spend(irina, Relationship.parent));

        System.out.println("-".repeat(150));

        System.out.print("У Ивана дети: ");
        System.out.println(new Reserch(gt).spend(ivan, Relationship.parent));

        System.out.println("-".repeat(150));

        System.out.print("Родители Маши: ");
        System.out.println(new Reserch(gt).spend(masha, Relationship.children));
        System.out.println("-".repeat(150));

        System.out.print("Братья и сёстры Маши: ");
        System.out.println(new Reserch(gt).spend(masha,Relationship.sisterbrother));
        System.out.println("-".repeat(150));

        System.out.print("Муж Ирины: ");
        System.out.println(new Reserch(gt).spend(irina,Relationship.husbandwife));
        System.out.println("-".repeat(150));

        System.out.print("Жена Ивана: ");
        System.out.println(new Reserch(gt).spend(ivan,Relationship.husbandwife));
        System.out.println("-".repeat(150));

    }

        static void print(GeoTree tree, Person name, Relationship re){
                System.out.printf("%s - %s по отношению к: ", name, re.toString());
                System.out.println(new Reserch(tree).spend(name,re));
            }
        
        //     static void print(GeoTree tree, Person name, SearchRe re){
        //         String st = "";
        //         if (re == SearchRe.grandParent) {
        //             if (name.getGender() == "Female") st = "GrandMother";
        //             else if (name.getGender() == "Male") st = "GrandFather";
        //             }
        //         else if (re == SearchRe.grandChildren) {
        //             if (name.getGender() == "Male") st = "GrandSon";
        //             else if (name.getGender() == "Female") st = "GrandDaughter";
        //         }
        //         System.out.printf("%s - %s по отношению к: ", name, st);
        //         System.out.println(new Reserch(tree).spend(name,re));
        //     }

        //     static void print(GeoTree tree, SearchAge se, int age){
        //         String st = "";
        //         if (se == SearchAge.ageYounger) st = "до";
        //         else if (se == SearchAge.ageOlder) st = "от";
        //         System.out.printf("Люди %s %d: ", st, age);
        //         System.out.println(new Reserch(tree).spend(se, age));
        //     }
        
        //     static void print(GeoTree tree, Gender ge){
        //         System.out.printf("Выводим всех %s: ", ge);
        //         System.out.println(new Reserch(tree).spend(ge));
        //     }
    }
