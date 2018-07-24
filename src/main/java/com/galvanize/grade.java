package com.galvanize;

public class grade {
    public static void main (String[] args){
        int input = 65;
        if (input > 89){
            System.out.println("A");
        } else if (input > 79){
            System.out.println("B");
        } else if (input > 69){
            System.out.println("C");
        } else if (input > 59){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
