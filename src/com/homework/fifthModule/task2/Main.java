package com.homework.fifthModule.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        List<Integer> uniqueList = getUniqueElements(list);
        System.out.println("Unique elements: " + uniqueList);
    }

    public static <T> List<T> getUniqueElements(List<T> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
