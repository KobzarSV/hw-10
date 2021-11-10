package main.java.ua.goit.task4;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        long a = 25214903917L;
        int c = 11;
        double m = Math.pow(2, 48);

        Stream<Long> result = randomEndlessStream(a, c, (int) m, 100);
        System.out.println(result.toList());
    }

    public static Stream<Long> randomEndlessStream(long a, int c, int m, long seed) {
        return Stream.iterate(seed, n -> (a * n + c) % m)
                .limit(10);
    }
}
