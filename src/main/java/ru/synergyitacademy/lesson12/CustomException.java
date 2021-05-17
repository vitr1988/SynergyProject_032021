package ru.synergyitacademy.lesson12;

public class CustomException extends Exception {

    public CustomException(String message){
        super(message);
    }

    public CustomException(){
        super("Exception happens because of some problems");
    }
}
