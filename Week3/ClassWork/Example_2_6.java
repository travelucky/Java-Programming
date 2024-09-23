package com.first.learn.Week3;

import java.util.Scanner;

public class Example_2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();
        int minutes = seconds / 60;

        int remainingSeconds = seconds % 60;
        System.out.print(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}
