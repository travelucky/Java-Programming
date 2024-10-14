package com.first.learn.WEEK6;

public class Lab6Task14 {
    public static void main(String[] args) {
        double money = 10000,add = 0.07;
        int year = 0;
        while(money <= 20000){
            year ++;
            money += add * money;
        }
        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %d years", money, year);
    }
}
