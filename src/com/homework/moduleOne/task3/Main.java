package com.homework.moduleOne.task3;

public class Main {

    /*Определить время суток*/

    public static void main(String[] args) {

        System.out.println(findTime(14));

    }

    public static String findTime(int a) {

        if (a > 3 && a < 12) {
            return "Morning";
        } else if (a > 11 && a < 17) {
            return "Day";
        } else if (a > 16 && a <= 23) {
            return "Evening";
        } else  if ( a >= 0 && a < 4){
            return  "Night";
        } else {
            return "Incorrect input";
        }

    }
}
