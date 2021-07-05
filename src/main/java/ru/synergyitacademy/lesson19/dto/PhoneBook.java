package ru.synergyitacademy.lesson19.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class PhoneBook {

    private final String code;
    private String name;
    private String lastName;
    private List<PhoneBook> contacts;

}
