package com.first.learn.WEEK5;

import java.util.Scanner;

public class Week5Task22 {
    public static void main(String[] args) {

        System.out.println("Enter a decimal value(0 to 15):");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number >= 0 && number <= 15){
            System.out.print("The hex value is ");
            if(number >= 10)
            {
                System.out.println((char)('A' + number - 10));
            }
            else System.out.println(number);
        }
        else
            System.out.printf("%d is an invalid input\n",number);

    }
}
