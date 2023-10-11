package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание: ");
        int task = scanner.nextInt();
        switch (task){
            case 1:{
                ArrayList<Integer> numbers = new ArrayList<>();
                Scanner scanner1 = new Scanner(System.in);

                int choice;
                do {
                    System.out.println("Меню:");
                    System.out.println("1. Додати елемент в список");
                    System.out.println("2. Видалити елемент з списку");
                    System.out.println("3. Показати вміст списку");
                    System.out.println("4. Перевірити чи є значення в списку");
                    System.out.println("5. Замінити значення в списку");
                    System.out.println("0. Вийти");
                    System.out.print("Виберіть опцію: ");

                    choice = scanner1.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Введіть число для додавання: ");
                            int numToAdd = scanner.nextInt();
                            numbers.add(numToAdd);
                            System.out.println("Елемент додано в список.");
                            break;
                        case 2:
                            System.out.print("Введіть індекс елемента для видалення: ");
                            int indexToRemove = scanner.nextInt();
                            if (indexToRemove >= 0 && indexToRemove < numbers.size()) {
                                numbers.remove(indexToRemove);
                                System.out.println("Елемент видалено зі списку.");
                            } else {
                                System.out.println("Недійсний індекс.");
                            }
                            break;
                        case 3:
                            System.out.println("Вміст списку: " + numbers);
                            break;
                        case 4:
                            System.out.print("Введіть число для перевірки: ");
                            int numToCheck = scanner.nextInt();
                            if (numbers.contains(numToCheck)) {
                                System.out.println("Елемент знайдено в списку.");
                            } else {
                                System.out.println("Елемент не знайдено в списку.");
                            }
                            break;
                        case 5:
                            System.out.print("Введіть індекс елемента для заміни: ");
                            int indexToReplace = scanner.nextInt();
                            if (indexToReplace >= 0 && indexToReplace < numbers.size()) {
                                System.out.print("Введіть нове значення: ");
                                int newValue = scanner.nextInt();
                                numbers.set(indexToReplace, newValue);
                                System.out.println("Значення замінено в списку.");
                            } else {
                                System.out.println("Недійсний індекс.");
                            }
                            break;
                        case 0:
                            System.out.println("Дякуємо за використання програми!");
                            break;
                        default:
                            System.out.println("Недійсний вибір. Спробуйте ще раз.");
                    }
                } while (choice != 0);

                scanner1.close();
            }
            break;
            case 2:{
                Map<String, String> users = new HashMap<>();
                Scanner scanner1 = new Scanner(System.in);

                int choice;
                do {
                    System.out.println("Меню:");
                    System.out.println("1. Додати нового користувача");
                    System.out.println("2. Видалення існуючого користувача");
                    System.out.println("3. Перевірити чи існує користувача");
                    System.out.println("4. Змінити логін існуючого користувача");
                    System.out.println("5. Змінити пароль існуючого користувача");
                    System.out.println("0. Вийти");
                    System.out.print("Виберіть опцію: ");

                    choice = scanner1.nextInt();
                    scanner.nextLine(); // Очищення буфера після введення числа

                    switch (choice) {
                        case 1:
                            System.out.print("Введіть логін нового користувача: ");
                            String newLogin = scanner.nextLine();
                            System.out.print("Введіть пароль нового користувача: ");
                            String newPassword = scanner.nextLine();
                            users.put(newLogin, newPassword);
                            System.out.println("Користувача додано.");
                            break;
                        case 2:
                            System.out.print("Введіть логін користувача, якого потрібно видалити: ");
                            String loginToDelete = scanner.nextLine();
                            if (users.containsKey(loginToDelete)) {
                                users.remove(loginToDelete);
                                System.out.println("Користувача видалено.");
                            } else {
                                System.out.println("Користувача з таким логіном не існує.");
                            }
                            break;
                        case 3:
                            System.out.print("Введіть логін користувача для перевірки: ");
                            String loginToCheck = scanner.nextLine();
                            if (users.containsKey(loginToCheck)) {
                                System.out.println("Користувач з таким логіном існує.");
                            } else {
                                System.out.println("Користувача з таким логіном не існує.");
                            }
                            break;
                        case 4:
                            System.out.print("Введіть логін користувача, якого потрібно змінити: ");
                            String loginToChange = scanner.nextLine();
                            if (users.containsKey(loginToChange)) {
                                System.out.print("Введіть новий логін: ");
                                String newLoginValue = scanner.nextLine();
                                String password = users.get(loginToChange);
                                users.remove(loginToChange);
                                users.put(newLoginValue, password);
                                System.out.println("Логін користувача змінено.");
                            } else {
                                System.out.println("Користувача з таким логіном не існує.");
                            }
                            break;
                        case 5:
                            System.out.print("Введіть логін користувача, пароль якого потрібно змінити: ");
                            String loginToChangePassword = scanner.nextLine();
                            if (users.containsKey(loginToChangePassword)) {
                                System.out.print("Введіть новий пароль: ");
                                String newPasswordValue = scanner.nextLine();
                                users.put(loginToChangePassword, newPasswordValue);
                                System.out.println("Пароль користувача змінено.");
                            } else {
                                System.out.println("Користувача з таким логіном не існує.");
                            }
                            break;
                        case 0:
                            System.out.println("Дякуємо за використання програми!");
                            break;
                        default:
                            System.out.println("Недійсний вибір. Спробуйте ще раз.");
                    }
                } while (choice != 0);

                scanner1.close();
            }
            break;
            default:
                System.out.println("Error!");
        }
    }
}