package ru.synergyitacademy.lesson12;

import java.io.IOException;

public class ReaderLauncher {

    public static void main(String[] args) /*throws Exception*/ {
        try {
            String content = FileReader.getContent("test1.txt");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File is unavailable");
        }
    }
}
