package HW4;

import java.util.ArrayList;

public class ToWork {

    public static void main(String[] args) {

        MostImportantTasks most = new MostImportantTasks(123, "play", 2023,2,18, 4, 2023,2,19, "Samsonov");

        LowerTasks lower = new LowerTasks(234, "swim", 2023,2,17, 2,2023,2,25, "Ivanov");

        ImportantTasks important = new ImportantTasks(545, "walk", 2023,2,16, 1 ,2023,2,24, "Petrov");

        LessImportantTasks less = new LessImportantTasks(981, "work", 2023,2,15, 3,2023,2,21, "Semenov");

        ArrayList<AbstractListTasks> Tasks = new ArrayList<>();
        Tasks.add(most);
        Tasks.add(lower);
        Tasks.add(important);
        Tasks.add(less);

        System.out.println("Список задач до сортировки: ");
        for (AbstractListTasks j : Tasks) {
           System.out.println(j); ;
        }
        System.out.println("-".repeat(150));
        System.out.println("Список задач, отсортированный по Deadline: ");
        Tasks.sort(new DeadlineComparator());
        for (AbstractListTasks d : Tasks) {
            System.out.println(d);
        }

        System.out.println("-".repeat(150));
        System.out.println("Список задач, отсортированный по важности: ");
        Tasks.sort(new DegreeOfImportanceComparator());
        for (AbstractListTasks g : Tasks) {
            System.out.println(g); ;
        }
    }
}
