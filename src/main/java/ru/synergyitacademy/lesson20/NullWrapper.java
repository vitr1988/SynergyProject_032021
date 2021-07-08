package ru.synergyitacademy.lesson20;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NullWrapper<T> {

    private T value;

    private NullWrapper(T t) {
        this.value = t;
    }

    public static <T> NullWrapper<T> of(T value) {
        return new NullWrapper<>(value);
    }
}


