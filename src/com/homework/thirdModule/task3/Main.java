package com.homework.thirdModule.task3;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        int numberToFind = 9;

        int index = linSearch(array, numberToFind);

        if (index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("Number not found in the array");
        }
    }

    public static int linSearch(int[] array, int numberToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFind) {
                return i;
            }
        }
        return -1;
    }
}
