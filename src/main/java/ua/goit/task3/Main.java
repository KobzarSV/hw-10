package main.java.ua.goit.task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"1, 2, 0", "4, 5"};

        System.out.println(streamOfArray(array));
    }

    public static String streamOfArray(String[] array) {
        return Arrays.stream(array)
                .map(n -> n.split(", "))
                .flatMap(Arrays::stream)
                .collect(Collectors.joining(", ", "\"", "\""));
    }
}
