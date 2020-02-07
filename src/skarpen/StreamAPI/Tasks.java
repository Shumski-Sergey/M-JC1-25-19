package src.skarpen.StreamAPI;

import java.util.stream.IntStream;

public class Tasks {
    public static void main(String[] args) {

        IntStream.concat(
                IntStream.range(2, 6),
                IntStream.rangeClosed(-1, 2))
                .forEach(x -> System.out.format("%s, ", +x));

        System.out.println("\n");

        IntStream.range(5, 30)
                .limit(12)
                .skip(3)
                .limit(6)
                .skip(2)
                .forEach(x -> System.out.format("%s, ", +x));

        System.out.println("\n");

        IntStream.range(0, 10)
                .skip(2)
                .dropWhile(x -> x < 5)
                .limit(3)
                .forEach(x -> System.out.print(x + ", ")); // 5 6 7

        System.out.println("\n");

        IntStream.range(0, 10)
                .skip(3)
                .takeWhile(a -> a < 5)
                .limit(3)
                .forEach(a -> System.out.print(a + ", "));//3, 4

        System.out.println("\n");

        IntStream.range(1, 5)
                .flatMap(i -> IntStream.generate(() -> i).limit(i))
                .forEach(i -> System.out.print(i + " "));

        System.out.println("\n");

        int x = IntStream.range(-2, 2)
                .map(i -> i * 5)
                .reduce(10, Integer::sum);
        System.out.println(x); //x : 0
    }
}


