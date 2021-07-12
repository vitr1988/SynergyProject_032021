package ru.synergyitacademy.lesson19;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRunner {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(25, 102, 98, 35, 17, 11).filter(i -> i % 2 == 1);
        // 25, 35, 17, 11
//        System.out.println(stream.max(Comparator.naturalOrder()).orElse(null));
//        System.out.println(stream.reduce((a, b) -> a + b).orElse(null));
//        System.out.println(stream.count());
//        LinkedHashMap<Object, Object> collect = stream.collect(Collectors.toMap(Function.identity(), Object::toString, (u, v) -> {
//            throw new IllegalStateException(String.format("Duplicate key %s", u));
//        }, LinkedHashMap::new));
//        System.out.println(collect);
//        System.out.println(stream.collect(Collectors.toMap(Function.identity(), Object::toString)));
//        System.out.println(stream.noneMatch(i -> i >= 35));
//        System.out.println(stream.anyMatch(i -> i == 11));
//        System.out.println(stream.allMatch(i -> i % 2 == 1));
        System.out.println(Arrays.toString(stream.toArray(Integer[]::new)));
    }
}
