package com.first.learn.WEEK5;

import java.util.Scanner;

public class Week5Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two cities separated by space");
        String city1 = sc.next();
        String city2 = sc.next();
        System.out.println("The alphabetical order is :");
        if(city1.compareTo(city2) < 0){
            System.out.println(city1 + " " + city2);
        }
        else System.out.println(city2 + " " + city1);
    }
}
