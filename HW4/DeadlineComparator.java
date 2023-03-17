package HW4;

import java.util.Comparator;

public class DeadlineComparator implements Comparator<AbstractListTasks> {
    
    @Override
    public int compare(AbstractListTasks d1, AbstractListTasks d2) {
        return d1.getDeadline() - d2.getDeadline();
    }
}
