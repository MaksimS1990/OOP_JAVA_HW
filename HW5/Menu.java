package HW5;

public class Menu {

    public void MenuPhonebook() {
    System.out.println("@" + "-".repeat(60) + "@");
    System.out.println("@" + "-".repeat(18) + "< Телефонный справочник >" + "-".repeat(17) + "@");
    System.out.println("@" + "-".repeat(60) + "@");
    System.out.println("Напишите соответствующую цифру, для выбора пункта меню: \n" +  
                                        "0 - Выход \n" + 
                                        "1 - Показать все контакты \n" + 
                                        "2 - Добавить контакт \n" + 
                                        "3 - Поиск контакта \n" +
                                        "4 - Удалить контакт \n" +
                                        "5 - Записать всё");

    }
}