package com.first.learn.WEEK4;

public class Lab2Task3 {
    public static void main(String[] args) {
        int day = 100, week = 7;
        int r = day % week;
        int two = 2;
        int now = (two + r) % week;
        if (now == 0)
            System.out.println("The day will be Sunday");
        else if (now == 1)
            System.out.println("The day will be Monday");
        else if (now == 2)
            System.out.println("The day will be Tuesday");
        else if (now == 3)
            System.out.println("The day will be Wednesday");
        else if (now == 4)
            System.out.println("The day will be Thursday");
        else if (now == 5)
            System.out.println("The day will be Friday");
        else if (now == 6)
            System.out.println("The day will be Saturday");
    }
}
