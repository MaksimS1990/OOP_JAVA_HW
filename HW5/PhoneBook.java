package HW5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneBook implements WriteFile, ReadFile {
    
    public void addAContact(ArrayList<Person> list) {

        System.out.println("Хотите добавить новый контакт? \n" + 
                                "enter - да; 0 - нет");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.contains("0")) {
                break;
            } else {
                System.out.println("Введите Имя: ");
                String Name = scanner.nextLine();
                System.out.println("Введите фамилию: ");
                String Surname = scanner.nextLine();
                System.out.println("Введите номер: ");
                String Number = scanner.nextLine();
                list.add(new Person(Name, Surname, Number));
                System.out.println("Хотите добавить еще один контакт? \n" + 
                                "enter - да; 0 - нет");
            }
        }
    }

    public void deleteContact(ArrayList List){
        System.out.println("Введите порядкой номер контакта, который хотите удалить: ");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        List.remove(in - 1);
    }

    @Override
    public void writeToFile(ArrayList<Person> PersonList) throws IOException {                            // записываем в файл
        FileWriter fw = new FileWriter("PhoneBook.csv", false);
        for (Person p : PersonList) {
            fw.write(p.getName() + " " + p.getSurname() + " " + p.getPhoneNumber() + "\n");
        }
        fw.close();
    }

    public void ReadFromFile(ArrayList<Person> PersonList) {                                              // читаем из файла и отлавливаем ошибки
        File f = new File("PhoneBook.csv");
        try {
            try (BufferedReader buf = new BufferedReader(new FileReader(f))) {
                String str;
                while ((str = buf.readLine()) != null) {
                    String getName = Arrays.asList(str.split(" ")).get(0);
                    String getSurname = Arrays.asList(str.split(" ")).get(1);
                    String getPhoneNumber = Arrays.asList(str.split(" ")).get(2);
                    PersonList.add(new Person(getName, getSurname, getPhoneNumber));
                }
            }
        } catch (IOException ex) {

            System.out.println("Ошибка чтения файла" + ex.getStackTrace());

        }
    }
}
