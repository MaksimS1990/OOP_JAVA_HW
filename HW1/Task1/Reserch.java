package Task1;

import java.util.ArrayList;
import java.util.HashSet;

enum SearchAge {
    younger,
    older
}

public class Reserch {
    HashSet<Person> result = new HashSet<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public String getResult(){
        StringBuilder names = new StringBuilder();
        for (Person t : this.result) names.append(t.getFullName());
        return names.toString();
    }
    
    
    public HashSet<Person> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2);
            }
        }
        return result;
    }

    public HashSet<Person> spend(SearchAge re, int ageRe){
        for (Node t : tree) {
            if (re == SearchAge.older) if (t.p1.getAge() >= ageRe) result.add(t.p1);
            if (re == SearchAge.younger) if (t.p1.getAge() <= ageRe) result.add(t.p1);
        }
            return result;
    }
}


