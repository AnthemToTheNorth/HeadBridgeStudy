package com.homework.firstModule.task1;

public class Main {

    /* Сравнить два числа на равенство или разность*/

    public static void main(String[] args) {
        System.out.println(compareNum(5,8));
    }

    public static String compareNum(int a, int b) {
        if(a==b) {
            return "Numbers are equal";
        } else if (a>b) {
            return "First num is greater";
        } else {
            return "Second number is greater";
        }
    }
}
