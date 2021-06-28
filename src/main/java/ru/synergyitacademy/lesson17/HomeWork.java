package ru.synergyitacademy.lesson17;

import java.util.HashSet;
import java.util.Set;

public class HomeWork {

    public static void main(String[] args) {

    }

    public Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public Set<Integer> union2(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        for (Integer value : set1) {
            result.add(value);
        }
        for (Integer value : set2) {
            result.add(value);
        }
        return result;
    }
}
