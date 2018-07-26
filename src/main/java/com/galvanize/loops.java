package com.galvanize;

public class loops {
    public static void main (String[] args){
        int num = 45;
        while(num <= 50){
            System.out.println(num);
            num++;
        }
        for (int i = 2; i < 7; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
