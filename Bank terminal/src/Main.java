import com.sun.source.tree.WhileLoopTree;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static void phone() {
        System.out.println("Введите ваш номер телефона: ");
        long phoneNumber = new Scanner(System.in).nextLong();
        System.out.println("Введенное значние: " + phoneNumber);
        System.out.println("В ближайшее время с вами свяжется наш консультант!");
        System.out.println("Будем рады видеть Вас снова!");
    }

    public static void ticket() {
        SecureRandom random = new SecureRandom();
        char randomizeCharacter = (char) (random.nextInt(26) + 'A');
        System.out.println("Номер вашего талона " + randomizeCharacter + "-" + random.nextInt(500));
        System.out.println("Дождитесь появление вашего номера на мониторе");
        System.out.println("Будем рады видеть Вас снова!");
    }

    public static void errors() {
        System.out.println("Ошибка! Выберите верный пункт!");
        System.out.println("Повторно запустите терминал, чтобы продолжить.");
    }


    public static void main(String[] args) {

            while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\t\t\tIDEA BANK");
            System.out.println("Здравствуйте уважаемый клиент!");
            System.out.println("Выберите интересующую вас услугу:");
            System.out.println("1.Вкладные и прочие счета.");
            System.out.println("2.Кредиты.");
            System.out.println("3.Валютно-обменные операции.");
            System.out.println("4.Прочие операции.");
            System.out.println("5.Завершить.");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Выберите интересующую вас услугу:");
                System.out.println("1.Открытие накопительного счета.");
                System.out.println("2.Заморозить действующий счет.");
                System.out.println("3.Снятие денежных средств с действующего счета.");

                int choiceTwo = scanner.nextInt();
                if (choiceTwo == 1 || choiceTwo == 2 || choiceTwo == 3) {
                    ticket();
                    break;
                } else {
                    errors();
                    break;
                }

            }
            if (choice == 2) {
                System.out.println("Выберите интересующую вас услугу:");
                System.out.println("1.Консультация.");
                System.out.println("2.Получение кредитной карты.");
                System.out.println("3.Досрочное погашение кредита.");
                int choiceThree = scanner.nextInt();
                if (choiceThree == 1) {
                    phone();
                    break;
                }
                if (choiceThree == 2 || choiceThree == 3) {
                    ticket();
                    break;
                } else {
                    errors();
                    break;
                }

            }
            if (choice == 3) {
                System.out.println("Выберите интересующую вас услугу:");
                System.out.println("1.Актуальный курс валют(Доллар и Евро).");
                System.out.println("2.Обменять валюту.");
                int choiceFour = scanner.nextInt();
                if (choiceFour == 1) {
                    String date = "16.09.2022";
                    double euro = 59.59;
                    double dollar = 59.63;
                    System.out.println("Актуальный курс валют на " + date + " Евро: " + euro + " Доллар: " + dollar);
                    System.out.println("Будем рады видеть Вас снова!");
                    break;
                }
                if (choiceFour == 2) {
                    ticket();
                    break;
                } else {
                    errors();
                    break;
                }

            }
            if (choice == 4) {
                System.out.println("Выберите интересующую вас услугу:");
                System.out.println("1.Получение зарплатной карты.");
                System.out.println("2.Консультация по услугам банка.");
                System.out.println("3.Получение пенсии.");
                int choiceFive = scanner.nextInt();
                if (choiceFive == 1 || choiceFive == 3) {
                    ticket();
                    break;
                }
                if (choiceFive == 2) {
                    phone();
                    break;
                } else {
                    errors();
                    break;
                }



            }
            if (choice == 5) {
                System.out.println("Будем рады видеть вас снова!");
                break;
            }
            else {
                errors();
                break;
            }
        }
    }
}