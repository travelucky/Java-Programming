package com.first.learn.WEEK6;

import java.util.Scanner;

public class Lab6Task2 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " and " + number2 + "? "
        );
        int answer = sc.nextInt();

        while (answer != number1 + number2) {
            System.out.println("Wrong answer. Try again. What is " + number1 + " and " + number2 + "?");
            answer = sc.nextInt();
        }
        System.out.println("You got it!");
    }

}
