package ru.synergyitacademy.lesson5;

import java.math.BigInteger;

public class RecursiveAlgorithmRunner {

    public static void main(String[] args) {
        int resultSumma = 0;
        BigInteger resultFact = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            resultSumma = summa(resultSumma, i);
        }
        System.out.println(resultSumma);

        for (BigInteger j = BigInteger.ONE; j.compareTo(BigInteger.valueOf(66L)) <= 0; j = j.add(BigInteger.ONE)) {
            resultFact = factorial(resultFact, j);
        }
        System.out.println(resultFact);
    }

    public static int summa(int a, int b) {
        return a + b;
    }

    public static BigInteger factorial(BigInteger a, BigInteger b) {
        return a.multiply(b);
    }
}
