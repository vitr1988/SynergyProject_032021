package ru.synergyitacademy.lesson19.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private String lastName;
    private String firstName;

    //equals and hashcode
}
