package com.homework.fifthModule.task1;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 200)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("Sum of even numbers in the range from 1 to 200: " + sum);
    }
}
