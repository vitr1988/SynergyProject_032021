package ru.synergyitacademy.lesson18.dto;

import lombok.Data;

import java.util.List;

@Data
public class Phonebook {
    private String code;
    private List<Phonebook> contacts;
}
