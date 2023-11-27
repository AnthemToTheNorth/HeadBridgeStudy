package com.homework.firstModule.task6;

import java.util.Scanner;

/*Написать калькулятор*/

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Input two num and char operation" );
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        char c = scnr.next().charAt(0);
        System.out.println(calculating(a,b,c));
    }

    public static int calculating(int a, int b, char c) {
        if (c == '+') {
            return a + b;
        } else if (c == '-') {
            return a - b;
        } else if (c == '*') {
            return a * b;
        } else if (c == '/') {
            return a / b;
        } else {
            System.out.println("Check your symbol or number");
            return 0;
        }
    }

}
