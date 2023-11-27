package com.homework.secondModule.task1;

/*Найти элемент в массиве*/

public class Main {
    public static void main(String[] args) {
        int number = 5;
        int[] array = {1, 3, 2, 4, 6, 7, 9, 8};

        System.out.println(checkElement(number, array));
    }

    public static boolean checkElement(int number, int[] array) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}
