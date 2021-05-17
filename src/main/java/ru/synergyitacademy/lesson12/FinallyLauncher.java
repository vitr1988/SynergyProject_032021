package ru.synergyitacademy.lesson12;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyLauncher {

    public static void main(String[] args) {
        System.out.println(getName("Russian"));
        System.out.println(getName("American"));
        System.out.println(getName("Ametican"));
    }

    private static String getName(String nationality) {
        FileInputStream fi = null;
        try (FileInputStream fis = new FileInputStream(FinallyLauncher.class.getResource("/test.txt").getFile())) {
            switch (nationality) {
                case "Russian":
                    return "Иван";
                case "American":
                    return "John";
                case "British":
                    return "Paul";
                default:
                    return "Ivan";
            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "иван";
        } catch (IOException io) {
            io.printStackTrace();
            return "иван";
        } finally {
            System.out.println("");
//            try {
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
}
