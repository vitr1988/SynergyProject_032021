package ru.synergyitacademy.lesson18;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {

    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("SMR", "Samara");
        linkedHashMap.put("MSK", "Moscow");
        linkedHashMap.put("KZN", "Kazan");
        linkedHashMap.put("NSK", "Novosibirsk");
        System.out.println(linkedHashMap);

        Map<String, String> treeMap = new TreeMap<>((o1, o2) -> {
            System.out.println("Empty string");
            return -1 * o1.compareTo(o2);
        });
        treeMap.putAll(linkedHashMap);
        System.out.println(treeMap);
    }
}
