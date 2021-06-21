package ru.synergyitacademy.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListRunner {
    public static void main(String[] args) {
        List<Integer> resultList = new ArrayList<>();
        Random random = new Random();
        int size = 0;
        while (size <= 10) {
            size = random.nextInt(20);
        }
        resultList.add(12);
        List<Integer> bufferList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            Integer newValue = random.nextInt();
            resultList.add(newValue);
            if (i % 2 == 1) {
                bufferList.add(resultList.get(resultList.indexOf(newValue)));
            }
        }
        System.out.println(resultList);
        System.out.println(resultList.size());
        Collection<Integer> collection = resultList;
        for (Iterator<Integer> iterator = collection.iterator(); iterator.hasNext(); ) {
            Integer currentValue = iterator.next();
            System.out.println(currentValue);
//            iterator.remove();
        }
        ListIterator<Integer> listIterator = resultList.listIterator();
        System.out.println("Before: " + collection);
        collection.remove(12);
        System.out.println("After: " + collection);

        System.out.println(collection.containsAll(bufferList));
//        collection.clear();

        collection.removeIf(value -> value < 0);
        System.out.println(collection);

        Integer[] array = collection.toArray(new Integer[]{});
        System.out.println(Arrays.toString(array));
    }
}
