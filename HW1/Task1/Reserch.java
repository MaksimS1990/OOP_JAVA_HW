package Task1;

import java.util.ArrayList;
import java.util.HashSet;

enum SearchRe {
    grandParent,
    grandChildren,
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

    public HashSet<Person> spend(Person p, SearchRe re){
        Relationship reTemp = Relationship.parent;
        if (re == SearchRe.grandParent) reTemp = Relationship.parent;
        if (re == SearchRe.grandChildren) reTemp = Relationship.children;
        ArrayList<Person> resultTemp = new ArrayList<Person>(spend(p, reTemp));
        this.result.clear();
            for (Person q: resultTemp) spend(q, reTemp);
        return result;
    }

}


