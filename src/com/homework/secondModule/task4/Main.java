package com.homework.secondModule.task4;

/*Расчет положительного n-го ряда числа Фибоначчи с помощью цикла*/

public class Main {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
