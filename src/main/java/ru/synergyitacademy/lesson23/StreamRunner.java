package ru.synergyitacademy.lesson23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StreamRunner {
    public static void main(String[] args) throws IOException {
        try (Reader fileReader = new BufferedReader(new FileReader("D:\\temp\\example.txt"))) {
            char[] temporaryBuffer = new char[512];
            while (fileReader.read(temporaryBuffer) != -1) {
                System.out.print(String.valueOf(temporaryBuffer));
            }
        }

//        List<String> lines = Files.readAllLines(Paths.get("D:\\temp\\example.txt"));
//        System.out.println(lines + "");

    }
}
