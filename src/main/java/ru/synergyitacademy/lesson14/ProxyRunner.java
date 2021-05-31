package ru.synergyitacademy.lesson14;

import lombok.RequiredArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyRunner {

    private static final int MIN_THRESHOLD = -100;
    private static final int MAX_THRESHOLD = 100;

    public static void main(String[] args) {
        Digit digit = new Digit(13);
        HasValue proxy = (HasValue) Proxy.newProxyInstance(ProxyRunner.class.getClassLoader(), new Class[]{HasValue.class},
                new DigitInvocationHandler(digit));
        System.out.println(proxy);
        int value = proxy.getValue();
        System.out.println(value);
        proxy.increment(87);
        value = proxy.getValue();
        System.out.println(value);
        proxy.increment(1);
        value = proxy.getValue();
        System.out.println(value);
    }


    @RequiredArgsConstructor
    static class DigitInvocationHandler implements InvocationHandler {

        private final Digit origin;

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long currentTimeNanos = System.nanoTime();
            if ("increment".equals(method.getName())) {

                if (origin.value >= MAX_THRESHOLD) {
                    throw new IllegalArgumentException("You can't increment more than " + MAX_THRESHOLD);
                }

                if (origin.value <= MIN_THRESHOLD) {
                    throw new IllegalArgumentException("You can't decrement less than " + MIN_THRESHOLD);
                }

                Even annotation = method.getParameters()[0].getAnnotation(Even.class);
                if (annotation != null) {
                    Integer integer = Integer.valueOf(args[0].toString());
                    if (integer % 2 != 1) {
                        args[0] = annotation.value();
                    }
                }
            }
            Object invoke = method.invoke(origin, args);
            System.out.printf("Method %s takes %d nanoseconds\n", method.getName(), System.nanoTime() - currentTimeNanos);
            return invoke;
        }
    }

}
