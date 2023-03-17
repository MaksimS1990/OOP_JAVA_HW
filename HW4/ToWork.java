package HW4;

import java.util.ArrayList;

public class ToWork {

    public static void main(String[] args) {

        MostImportantTasks most = new MostImportantTasks(12345, "most", 160323, 4,2003, "Samsonov");

        LowerTasks lower = new LowerTasks(23411, "lowe", 160323, 2,2003, "Ivanov");

        ImportantTasks important = new ImportantTasks(54541, "impo", 150323, 1 ,2003, "Petrov");

        LessImportantTasks less = new LessImportantTasks(98125, "less", 140323, 3,2003, "Semenov");

        ArrayList<AbstractListTasks> Tasks = new ArrayList<>();
        Tasks.add(most);
        Tasks.add(lower);
        Tasks.add(important);
        Tasks.add(less);

        System.out.println("Список задач до сортировки: ");
        for (AbstractListTasks d : Tasks) {
           System.out.println(d); ;
        }
        System.out.println("-".repeat(150));
        System.out.println("Список задач, отсортированный по Deadline: ");
        Tasks.sort(new DeadlineComparator());
        for (AbstractListTasks d : Tasks) {
            System.out.println(d); ;
        }

        System.out.println("-".repeat(150));
        System.out.println("Список задач, отсортированный по DegreeOfImportant: ");
        Tasks.sort(new DegreeOfImportanceComparator());
        for (AbstractListTasks g : Tasks) {
            System.out.println(g); ;
        }
    }
}
