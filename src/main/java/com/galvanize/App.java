package com.galvanize;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        BankAccount banking = new BankAccount();
        banking.deposit(125);
        banking.isOverDrawn();
        banking.balance();
        System.out.println(banking);
    }
}
