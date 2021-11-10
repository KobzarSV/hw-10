package main.java.ua.goit.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Andrey", "Peter", "Sergey", "Dim", "Anna", "Irina");

        System.out.println(namesOddIndex(names));
    }

    public static List<String> namesOddIndex(List<String> names) {
        return names.stream()
                .map(name -> (names.indexOf(name) + 1) + ". " + name)
                .filter(name -> Integer.parseInt(name.substring(0, 1)) % 2 != 0)
                .collect(Collectors.toList());
    }
}
