package ru.synergyitacademy.lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamRunner {

    private static final String LAST_NAME = "Ivanov";

    public static void main(String[] args) {
        Collection<String> result =
                Arrays.asList("Ivan", "Peter", "Vitalii", "Anna");
        Collection<String> resultWithLastName = new ArrayList<>(result.size());
        for (String name : result) {
            if (name.length() >= 5) {
                resultWithLastName.add(LAST_NAME + " " + name);
            }
        }
        System.out.println(resultWithLastName);
        List<String> names = result.stream()
                .filter(name -> name.length() >= 5)
                .map(name -> LAST_NAME + " " + name)
                .collect(Collectors.toList());
        System.out.println(names);

        List<List<String>> resultListString = Arrays.asList(//[[1], [2, 3], [3,4,5,6]]
                Arrays.asList("1"), Arrays.asList("2", "3"), Arrays.asList("3", "4", "5", "6")
        );
        // result: [1, 2, 3, 3, 4, 5, 6]
        List<String> newResult = new ArrayList<>();
        for (List<String> list : resultListString) {
            newResult.addAll(list);
        }
        System.out.println(newResult);
//        Stream<Stream>
        List<String> results = resultListString.stream()
//                .flatMap(list -> list.stream())
                .flatMap(Collection::stream)
                .peek(System.out::println)
                .skip(2)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(results);

        Random random = new Random();
        int size = random.nextInt(1000);
        System.out.println(size);
        List<Integer> intList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            intList.add(random.nextInt());
        }
        System.out.println(intList.stream().count());
    }
}
