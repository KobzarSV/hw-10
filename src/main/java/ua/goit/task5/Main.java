package main.java.ua.goit.task5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println((zip(Stream.of(1, 2, 3), Stream.of(4, 5, 6, 7, 8))).collect(Collectors.toList()));
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        Stream<T> result = Stream.empty();
        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            result = Stream.concat(result, Stream.of(iteratorFirst.next(), iteratorSecond.next()));
        }
        return result;
    }
}
