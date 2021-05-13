package ru.synergyitacademy.lesson4;

import java.math.BigInteger;
import java.util.Arrays;

public class ArrayRunner {

    public static void main(String[] args) {
//        int[] array = new int[100];
        int[] array = new int[] {1, 2, 3};
        BigInteger[] arrayInts = new BigInteger[100];
        for (int i = 0; i < arrayInts.length; i++) {
            arrayInts[i] = BigInteger.ONE;
        }
        for (BigInteger i : arrayInts) {
            System.out.println(i);
        }
//        System.out.println(Arrays.toString(arrayInts));
    }
}
