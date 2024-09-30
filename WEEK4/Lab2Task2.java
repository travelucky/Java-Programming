package com.first.learn.WEEK4;

import java.util.Scanner;

public class Lab2Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int seconds = sc.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println("Now,the time is:");
        System.out.println(minutes + " minutes, " + remainingSeconds + " seconds");
    }
}
