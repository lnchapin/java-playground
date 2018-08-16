package com.galvanize;

public class BankAccount {
    private String name;
    private float balance;
    private boolean isOverDrawn;

    public void deposit (float value){
        balance += value;
    }
    public void withdraw (float value){
        balance -= value;
    }

    public void balance() {
        System.out.printf("balance");
    }

    public void isOverDrawn(){
        if (balance < 0) {
            isOverDrawn = true;
        } else {
            isOverDrawn = false;
        }
    }
}
