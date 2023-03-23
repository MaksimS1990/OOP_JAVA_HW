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
                                        "3 - Добавить номер телефона к контакту \n" +  
                                        "4 - Поиск контакта \n" +
                                        "5 - Удалить контакт \n" +
                                        "6 - Записать всё");

    }
}