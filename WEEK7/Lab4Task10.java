package com.first.learn.WEEK7;

public class Lab4Task10 {
        //Generate a random character between ch1 and ch2
        public static char getRandomCharacter(char ch1,char ch2){
            return(char)(ch1 +Math.random()*(ch2 -ch1 +1));
        }
        //Generate a random lowercase letter
        public static char getRandomLowerCaseLetter(){
            return getRandomCharacter('a','z');
        }
        //Generate aandom lowercse letterracas
        public static char getRandomUpperCaseLetter(){
            return getRandomCharacter('A','Z');
        }
    }
