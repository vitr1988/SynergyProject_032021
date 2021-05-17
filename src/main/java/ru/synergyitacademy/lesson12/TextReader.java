package ru.synergyitacademy.lesson12;

import org.apache.commons.io.IOUtils;
import ru.synergyitacademy.lesson11.ExceptionRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class TextReader {

    public static String getContent(String fileName) throws IOException, CustomException {
        URL resource = ExceptionRunner.class.getResource("/" + fileName);
        if (resource != null) {
            try (FileInputStream fileInputStream = new FileInputStream(resource.getFile())) {
                return IOUtils.toString(fileInputStream, StandardCharsets.UTF_8);
            }
        }
        throw new CustomException(/*"File " + fileName + " isn't found on file system"*/);
    }
}
