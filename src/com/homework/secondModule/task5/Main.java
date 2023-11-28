package com.homework.secondModule.task5;

/*without returning an array */

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5, 5, 5};
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        int runner = arr[0];
        boolean duplicateFound = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == runner) {
                if (!duplicateFound) {
                    System.out.print("Duplicates of " + runner + " found at ind: " + (i - 1));
                    duplicateFound = true;
                }
                System.out.print(", " + i);
            } else {
                if (duplicateFound) {
                    System.out.println();
                    duplicateFound = false;
                }
                runner = arr[i];
            }
        }

        if (duplicateFound) {
            System.out.println();
        }
    }
}
