package HW4;

import java.util.Comparator;

public class DegreeOfImportanceComparator implements Comparator<AbstractListTasks> {

    @Override
    public int compare(AbstractListTasks g1, AbstractListTasks g2) {
        return g1.getDegreeOfImportance() - g2.getDegreeOfImportance();
    }
    
}
