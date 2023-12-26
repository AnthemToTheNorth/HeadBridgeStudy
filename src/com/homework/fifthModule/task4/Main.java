package com.homework.fifthModule.task4;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("car", "book", "string");
        String result = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}