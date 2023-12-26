package com.homework.thirdModule.task1;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        // Bubble Sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Print array
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
