package ru.synergyitacademy.lesson18;

import ru.synergyitacademy.lesson18.dto.Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class HomeworkRunner {

    private static final List<String> NAMES = new ArrayList<>() /*{{
        add("");
    }}*/;

    static {
        NAMES.add("");
    }

    public static void main(String[] args) {
        LinkedList<Phonebook> resultList = new LinkedList<>();
        Iterator<Phonebook> phonebookIterator = resultList.descendingIterator();
        while (phonebookIterator.hasNext()) {
            Phonebook next = phonebookIterator.next();
        }
        TreeSet<Phonebook> resultSet = new TreeSet<>();
        resultSet.descendingIterator();
        Map<String, Phonebook> resultMap = new HashMap<>();
        Iterator<Map.Entry<String, Phonebook>> entryIterator =
                new TreeSet<>(resultMap.entrySet()).descendingIterator();

    }
}
