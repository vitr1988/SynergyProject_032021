package ru.synergyitacademy.lesson14;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationRunner {

    public static void main(String[] args) throws Exception {
        Digit digit = new Digit(13);

        Class<? extends Digit> digitClass = digit.getClass();
        Field valueField = digitClass.getDeclaredField("value");
        Even evenAnnotation;
        if ((evenAnnotation = valueField.getAnnotation(Even.class)) != null) {
            valueField.setAccessible(true);
            int digitValue = (int) valueField.get(digit);
            if (digitValue % 2 == 1) {
                valueField.set(digit, evenAnnotation.value());
                System.out.println(evenAnnotation.message());
            }
        }
        Method incrementMethod = digitClass.getDeclaredMethod("increment", int.class);
        Even evenParamMethod = incrementMethod.getParameters()[0].getAnnotation(Even.class);
        if (evenParamMethod != null) {

        }
        System.out.println(digit);
    }
}
