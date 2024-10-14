package com.first.learn.WEEK6;
import java.util.Scanner;
public class Lab6Task6 {
    /**Main method */
    public static void main(String[]args){
        int data;
        int sum =0;
        //Create a Scanner
        Scanner input =new Scanner(System.in);
        //Keep reading data until the input is 0
        do {
            System.out.print("Enter an integer (the input of ends if it is 0):");
            data=input.nextInt();
            sum+=data;
        }while(data !=0);
        System.out.println("The sum is "+sum);
    }
}
