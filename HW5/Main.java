package HW5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        PhoneBook phoneBook = new PhoneBook();
        ArrayList<Person> PersonList = new ArrayList<>();
        phoneBook.ReadFromFile(PersonList);
        Menu menu = new Menu();

        while (true) {
            menu.MenuPhonebook();
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            if (str.equals("0")) {
                break;
            } else if (str.equals("1")) {
                for (int i = 0; i < PersonList.size(); i++) {
                    System.out.println(i + 1);
                    PersonList.get(i).print();
                }

                System.out.println("Нажмите enter, чтобы продолжит!");
                str = scanner.nextLine();

            } else if (str.equals("2")) {
                phoneBook.addAContact(PersonList);
            } else if (str.equals("3")) {
                System.out.println("Введите имя, фамилию либо номер телефона искомого: ");
                str = scanner.nextLine();
                for (Person p : PersonList) {
                    if (p.contains(str)) {
                        p.print();
                    }
                }
                System.out.println("Нажмите enter, чтобы продолжит!");
                str = scanner.nextLine();
            } else if (str.equals("4")) {
                phoneBook.deleteContact(PersonList);
                System.out.println("Нажмите enter, чтобы продолжит!");
                str = scanner.nextLine();
            } else if (str.equals("5")) {
                phoneBook.writeToFile(PersonList);
            }
        }
    }    
    }
