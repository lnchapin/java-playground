package com.galvanize;

class BankAccount {
    public String name;
    public float balance = 0.00f;
    public boolean isOverDrawn;

    @Override
    public String toString() {
        return "BankAccount {" +
                "name = " + name +
                ", balance = " + balance +
                ", is Overdrawn = " + isOverDrawn +
                "}";
    }

    public void deposit (long cents){
        balance += (cents/1f);
    }
    public void withdraw (long cents){
        balance -= (cents/1f);
    }

    public float balance() {
        return balance;
    }

    public boolean isOverDrawn(){
        if (balance < 0) {
            isOverDrawn = true;
            return true;
        } else {
            isOverDrawn = false;
            return false;
        }
    }
}

