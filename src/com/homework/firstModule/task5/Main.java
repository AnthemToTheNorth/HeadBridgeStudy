package com.homework.firstModule.task5;

public class Main {

    /*Найти факториал*/

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }

    public static int findFactorial(int a){
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }

}
