package org.example;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Adam", "Adamek", "123456789", "AdAd", "12345678999", 100000, 1234);
        Scanner sc = new Scanner(System.in);

        System.out.println("Witaj w naszym banku");
        System.out.println("Użytkowniku wpisz login");
        String login = sc.next();
        if (login.equals(account1.getLogin())) {
            System.out.println("Login jest poprawny");
        } else {
            System.out.println("Login jest niepoprawny");
            exit(0);
        }
        System.out.println("podaj kod PIN");
        int pin = sc.nextInt();
        if (pin == account1.getPin()) {
            System.out.println("PIN jest poprawny");
        } else {
            System.out.println("PIN jest niepoprawny");
            exit(0);
        }


        int choice;
        do {
            System.out.println("MENU - Wybierz numerycznie opcję, która cię interesuje" + "\n 1 - Wypłata \n 2 - Wpłata\n 3 - Saldo \n 4 - Weź kredyt \n 5 - Przewalutowanie \n 6 - Przelew \n 7 - Wyjscie");
            System.out.println("Co wybierasz?");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ile chceszy wypłacić gotówki?");
                    double wyplata = sc.nextInt();
                    account1.withdraw(wyplata);
                    System.out.println(account1.getBalance());
                    break;
                case 2:
                    System.out.println("Wpłacanie gotówki");
                    double wplata = sc.nextInt();
                    account1.add(wplata);
                    System.out.println("Aktualny stan konta wynosi: " + account1.getBalance()+ " PLN");
                    break;
                case 3:
                    System.out.println("Sprawdzenie salda");
                    System.out.println(account1.getBalance());
                    break;
                case 4:
                    System.out.println("Jaką kwote chcesz pożyczyć?");
                    double borrow = sc.nextInt();
                    account1.credit(borrow);
                    System.out.println("Nowy stan konta :"+account1.getBalance() + " PLN");

                break;
                case 5:
                    System.out.println(" Masz XX EUR");

                    break;
                case 6:
                    System.out.println("Przelew wykonany");
                    break;
                case 7:
                    System.out.println("Bye bye kierowniku kochany");
                    exit(0);
            }
        } while (choice != 5);

    }

}