package ru.synergyitacademy.lesson11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionRunner {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("test.txt");
            print("");
            int v = Calculator.divide(25, 0);
            Integer max = null;
            int zero = max;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Prohibited division by 0");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Can't transform null to primitive value");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception happens");
        } catch (Throwable th) {
            th.printStackTrace();
            System.out.println("Problem happens");
        }
        System.out.println("Hello World!");
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
