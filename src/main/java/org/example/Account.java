package org.example;

public class Account {
    private String name;
    private String lastName;
    private String pesel;
    private String login;
    private String accountNumber;
    private double balance;
    private int pin;

    Account(String name, String lastName, String pesel, String login, String accountNumber, double balance, int pin) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.login = login;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;

    }

    public String getLogin() {
        return login;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public double withdraw(double moneyToWithdraw) {
        return balance = balance - moneyToWithdraw;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

}
