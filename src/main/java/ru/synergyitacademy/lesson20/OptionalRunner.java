package ru.synergyitacademy.lesson20;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalRunner {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 14, 100, 21, 98, 45, 6);
        Optional<Integer> first = intList.stream().findFirst();

        Optional<Integer> value = first; Optional.empty(); //Optional.ofNullable(null);

        Optional<Integer> integer = value.map(v -> v + 100)
//                .map(i -> i % 2 == 0)
                .filter(i -> i % 2 == 0);

        if (integer.isPresent()) {
            System.out.println(integer.get());
        } else {
            System.out.println("value is empty");
        }

//        Optional.of(-1)
        int val = value.orElse(-1);
        Integer objectHasNoValue = value.orElseThrow(() -> new IllegalArgumentException("Object has no value"));
        value.orElseGet(() -> -1); //lazy computation


        System.out.println(first.orElse(null));
        Integer digit = 16;
        System.out.println(sqrt(digit));

        System.out.println(Stream.of(1, 2, 3).findFirst() // Optional<Optional<Integer>>
            .flatMap(Optional::of)
                .filter(i -> i % 2 == 1)
                .orElse(-1));

        System.out.println(intList.stream().findAny().orElse(-1)); // 100
    }

    private static double sqrt(Integer digit) {
//        digit = Objects.requireNonNull(digit, "Can't perform this operation with null or negative values");
        if (digit != null && digit >= 0) {
            return Math.sqrt(digit);
        }
        throw new IllegalArgumentException("Can't perform this operation with null or negative values");
    }
}
