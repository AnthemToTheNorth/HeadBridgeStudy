package com.homework.thirdModule.task4;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        int numberToFind = 9;

        bubbleSort(array);

        int index = binarySearch(array, numberToFind);

        if (index != -1) {
            System.out.println("Number found: " + numberToFind);
        } else {
            System.out.println("Number not found");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] array, int numberToFind) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == numberToFind)
                return mid;

            if (array[mid] < numberToFind)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return -1;
    }
}
