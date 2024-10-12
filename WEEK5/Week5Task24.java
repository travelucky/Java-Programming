package com.first.learn.WEEK5;

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class Week5Task24 {
    public static void main(String[] args) {
        System.out.println("Enter a letter: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(isLetter(s.charAt(0))){
            if(s.charAt(0) == 'A' || s.charAt(0) == 'E' || s.charAt(0) == 'I' || s.charAt(0) == 'O' ||
                    s.charAt(0) == 'U' || s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i'){
                System.out.printf("%c is a vowel\n", s.charAt(0));
            }
            else System.out.printf("%c is a consonant\n", s.charAt(0));
        }
        else System.out.printf("%c is an invalid input\n", s.charAt(0));
    }
}
