package com.homework.moduleOne.task4;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeap(2024));

    }

    public static boolean isLeap(int a) {

        return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;

    }
}
