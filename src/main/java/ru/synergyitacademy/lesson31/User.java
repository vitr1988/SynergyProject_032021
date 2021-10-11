package ru.synergyitacademy.lesson31;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class User {
    @Getter
    private Long id;
    private String name;
    @Setter
    private List<Rights> rights;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean canWrite() {
        return rights.contains(Rights.WRITE);
    }
}
