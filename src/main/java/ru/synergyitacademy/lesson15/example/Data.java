package ru.synergyitacademy.lesson15.example;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
public class Data {

    private Long id;
    private String content;
    private Attribute attribute;

    @Getter
    @Setter
    @Accessors(chain = true)
    public static class Attribute {
        private String code;
        private String name;
    }

}
