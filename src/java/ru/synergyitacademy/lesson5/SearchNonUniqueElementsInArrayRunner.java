package ru.synergyitacademy.lesson5;

import java.util.Arrays;

public class SearchNonUniqueElementsInArrayRunner {

    public static void main(String[] args) {
        char[] symbols = new char[]{'а', 'б', 'в', 'а', 'г', 'я'};
        boolean result = false;
        for (int i = 0; i < symbols.length; i++) {
            char c = symbols[i];
            for (int j = i + 1; j < symbols.length; j++) {
                char symbol = symbols[j];
                if (!result && c == symbol) {
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
//        Arrays может быть полезен
        System.out.println(result ? "В массиве есть повторения" : "В массиве нет повторений");
    }
}
