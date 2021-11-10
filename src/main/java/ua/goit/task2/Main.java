package main.java.ua.goit.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Andrey", "Peter", "Sergey", "Dim", "Anna", "Irina");

        System.out.println(namesUpperSort(names));
    }

    private static List<String> namesUpperSort(List<String> names) {
        return names.stream()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
