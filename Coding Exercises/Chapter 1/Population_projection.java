package com.first.learn.chapter1;

public class Population_projection {
    public static void main(String[] args) {
        int day_of_year = 365,seconds = 60,hours = 24;
        int total_second = day_of_year * hours * seconds * seconds;
        double current_population = 312032486;
        double birth = total_second / 7.0,death = total_second / 13.0,
                immigrant = total_second / 45.0;
        for (int year = 1; year <= 5;year++){
            current_population = current_population + immigrant - death + birth;
            System.out.println("The "+ year + " year population is " + current_population);
        }
    }
}
