package ru.synergyitacademy.lesson23;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileRunner {

    public static void main(String[] args) throws IOException {
//        File file = new File("D:\\temp1\\example.txt");
//        if (!file.exists()) {
//            file.getParentFile().mkdirs();
//            file.createNewFile();
//        }

        Path path = Paths.get("D:\\temp", "example.txt");
        File file = path.toFile();
        if (!file.exists()) {
            path.getParent().toFile().mkdirs();
            Files.createFile(path);
        }
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.append("Текущее время : " + LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME) + "\n");
        }
    }
}
