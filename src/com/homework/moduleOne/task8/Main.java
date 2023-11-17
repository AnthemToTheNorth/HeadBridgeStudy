package com.homework.moduleOne.task8;

public class Main {

    /*Простое ли число*/
    /*Списано*/

    public static void main(String[] args) {

        int num = 29;
        System.out.println(isPrime(num));

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
