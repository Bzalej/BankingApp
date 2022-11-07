package org.example;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Account account1=new Account("Adam","Adamek","123456789","AdAd","12345678999",1000000,1234);
        Scanner sc=new Scanner(System.in);

        System.out.println("Witaj w naszym banku");
        System.out.println("Użytkowniku wpisz login");
        String login=sc.next();
        if (login.equals(account1.getLogin())) {
            System.out.println("Login jest poprawny");
        }else{
        System.out.println("Login jest niepoprawny");
        exit(0);
        }
        System.out.println("podaj kod PIN");
        int pin=sc.nextInt();
        if (pin==account1.getPin()) {
            System.out.println("PIN jest poprawny");
        }else{
            System.out.println("PIN jest niepoprawny");
            exit(0);
        }
        System.out.println("MENU - Wybierz numerycznie opcję, która cię interesuje"+"\n 1 - Wypłata \n 2 - Wypłata\n 3 - Saldo \n 4 - Weź kredyt \n 5 - Przewalutowanie \n 6 - Przelew \n 7 - Wyjscie");
        System.out.println("Co wybierasz?");
        do ()
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Wypłacanie gotówki");
                break;
            case 2:
                System.out.println("Wpłacanie gotówki");
                break;
            case 3:
                System.out.println("Masz XX PLN");
                break;
            case 4:
            System.out.println("Wziąłeś kredyt... teraz? SERIO?");
            break;
            case 5:
                System.out.println(" Masz XX EUR");
                break;
            case 6:
                System.out.println("Pzelew wykonany");
                break;
            case 7:
                System.out.println("Bye bye kierowniku kochany");
        }

    }

}