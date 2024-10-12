package com.first.learn.WEEK5;

import java.util.Scanner;

public class Week5Task25 {
    public static void main(String[] args) {
        System.out.print("Enter the first city: ");
        Scanner sc = new Scanner(System.in);
        String city1 = sc.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = sc.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = sc.nextLine();
        String s1,s2,s3;
        if (city1.compareTo(city2) < 0)
        {
            s1 = city1;
            s2 = city2;
        }
        else {
            s2 = city1;
            s1 = city2;
        }
        if (s1.compareTo(city3) < 0){
           if(s2.compareTo(city3) < 0){
               s3 = city3;
           }
           else {
               s3 = s2;
               s2 = city3;
           }
        }
        else {
            s3 = s2;
            s2 = s1;
            s1 = city3;
        }
        System.out.printf("The three cities in alphabetical order are: %s %s %s\n", s1, s2, s3);
    }

}
