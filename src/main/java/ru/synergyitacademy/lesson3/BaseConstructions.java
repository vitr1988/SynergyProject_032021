package ru.synergyitacademy.lesson3;

public class BaseConstructions {

    public static void main(String[] args) {
//       int range: -2^31..2^31 - 1
        int summa = 78 % 15; // 78 = 15 * 5 + 3; 15 = 0 * 78 + 15
        int evenDigit = 78;
        int oddDigit = 15;
        System.out.println(evenDigit % 2 == 0);
        System.out.println(oddDigit % 2 == 1);
        int warning = 15 / 2; // целочисленное деление, поэтому результат 7, а не 7.5
        System.out.println(warning);
        System.out.println(15 / 3 + 6 - 28 * 15);
//       byte range: -2^7..2^7 - 1 = -128..0..127 2 ^ 8 = 256
        byte example = (byte) 130;
        System.out.println("Byte example: " + example);
        byte byteDigit = 0b1111111; // 1 * 2 ^ 0 + 1 * 2 ^ 1 + 1 * 2 ^ 2 + 1 * 2 ^ 3 + 1 * 2 ^ 4 + 1 * 2 ^ 5 + 1 * 2 ^ 6 = 127
        System.out.println(byteDigit);
        byte anotherByteDigit = 0b1011111; // 1 * 2 ^ 0 + 1 * 2 ^ 1 + 1 * 2 ^ 2 + 1 * 2 ^ 3 + 1 * 2 ^ 4 + 0 * 2 ^ 5 + 1 * 2 ^ 6 = 127 - 32 = 95;
        System.out.println(anotherByteDigit);
        int anotherHexDigit = 0x1234; // 4 * 16 ^ 0 + 3 * 16 ^ 1 + 2 * 16 ^ 2 + 1 * 16 ^ 3 = 4660; 0 .. 9 A B C .. F
        int anotherOctetDigit = 017; // 0 .. 7 = 7 * 8 ^ 0 + 1 * 8 ^ 1 = 15
        System.out.println(anotherHexDigit);
        System.out.println(anotherOctetDigit);
        long longResult = 5456123156154561529L;

        float operand1 = 15F;
        float correctResult = operand1 / 2;
        System.out.println(correctResult);

        double res = 15.5;
        double naN = Double.NaN;
        double d = ++res; // res = res + 1; // 16.5
        System.out.println(++res + 12); // 29.5
        System.out.println(d);
        double result = res * 3;
        System.out.println(result);
        System.out.println(--result);
    }
}
