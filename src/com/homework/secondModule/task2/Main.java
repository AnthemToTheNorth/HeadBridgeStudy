package com.homework.secondModule.task2;

/*Найти индекс минимального элемента в массиве*/

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 1, 6, 7, 8, 4};

        System.out.println(findMinIndex(array));
    }

    public static int findMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
