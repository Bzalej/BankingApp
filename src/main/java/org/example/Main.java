package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1=new Account("Adam","Adamek","123456789","AdAd","12345678999",1000000,1234);
        Scanner sc=new Scanner(System.in);

        System.out.println("Witaj w naszym banku");
        System.out.println("Użytkowniku wpisz login");
        String login=sc.next();
        System.out.println("podaj kod PIN");
        int pin=sc.nextInt();



    }

}