package com.homework.secondModule.task3;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {5, 2, 3},
                {1, 6, 7},
                {8, 4, 9}
        };

        int[] inds = findMinInd(array);
        System.out.println("Array: " + inds[0] + ", Index: " + inds[1]);
    }

    public static int[] findMinInd(int[][] array) {
        int minArray = 0;
        int minInd = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < array[minArray][minInd]) {
                    minArray = i;
                    minInd = j;
                }
            }
        }
        return new int[]{minArray, minInd};
    }
}
