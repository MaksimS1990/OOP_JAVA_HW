package Task1;

import java.util.ArrayList;

public class GeoTree extends Humanity {

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person person1, Relationship re1, Person person2, Relationship re2) {
        tree.add(new Node(person1, re1, person2));
        tree.add(new Node(person2, re2, person1));
    }
    
}
