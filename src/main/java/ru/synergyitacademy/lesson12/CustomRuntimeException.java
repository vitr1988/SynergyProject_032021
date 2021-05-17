package ru.synergyitacademy.lesson12;

public class CustomRuntimeException extends RuntimeException {

    public CustomRuntimeException() {
        super("Custom exception happens during execution");
    }
}
