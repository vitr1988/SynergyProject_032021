package ru.synergyitacademy.lesson34.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.net.URL;

@Data
@Component
@ConfigurationProperties("application")
public class ApplicationProperties {

    private Integer value;

    private SettingsProperties setting;

    @Data
    public static class SettingsProperties {
        private String name;
        private Long value;
        private String url;
    }
}
