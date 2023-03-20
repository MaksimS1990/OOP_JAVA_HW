package HW5;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    
    public void addAContact(ArrayList ListContacts) {

        System.out.println("Хотите добавить новый контакт? \n" + 
                                "enter - да; 0 - нет");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            } else {
                System.out.println("Введите номер: ");
                String inputNumber = scanner.nextLine();
                System.out.println("Введите Имя: ");
                String Name = scanner.nextLine();
                System.out.println("Введите фамилию: ");
                String Surname = scanner.nextLine();
                System.out.println("Хотите добавить еще один контакт? \n" + 
                                "enter - да; 0 - нет");
            }
        }
    }

    public void deleteContact(ArrayList ListContacts){
        System.out.println("Введите порядкой номер для удаления контакта");
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        ListContacts.remove(in - 1);
    }
}
