package com.galvanize;

public class BankAccount {
    private String name;
    private float balance = 0.00f;
    private boolean isOverDrawn;

    @Override
    public String toString() {
        return "BankAccount {" +
                "name = " + name +
                ", balance = " + balance +
                ", is Overdrawn = " + isOverDrawn +
                "}";
    }

    public void deposit (float value){
        balance += value;
    }
    public void withdraw (float value){
        balance -= value;
    }

    public void balance() {
        System.out.println(balance);
    }

    public void isOverDrawn(){
        if (balance < 0) {
            isOverDrawn = true;
        } else {
            isOverDrawn = false;
        }
    }
}
