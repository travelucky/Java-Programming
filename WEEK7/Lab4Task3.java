package com.first.learn.WEEK7;

public class Lab4Task3 {
    public static void main(String[] args) {
        System.out.print("The grade is ");
        printGrade(78.5);

        System.out.print("The grade is ");
        printGrade(59.5);

    }
    public static void printGrade(double grade) {
        if(grade >= 90) {
            System.out.println("A");
        }
        else if(grade >= 80) {
            System.out.println("B");
        }
        else if(grade >= 70) {
            System.out.println("C");
        }
        else if(grade >= 60) {
            System.out.println("D");
        }
        else
            System.out.println("F");
    }
}
