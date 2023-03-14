package Task3;

import java.util.Comparator;

public class PetNameComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet o1, Pet o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
    
}
