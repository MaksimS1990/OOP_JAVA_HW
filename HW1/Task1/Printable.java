package Task1;

public interface Printable {
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
