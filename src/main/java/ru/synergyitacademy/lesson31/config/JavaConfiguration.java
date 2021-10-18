package ru.synergyitacademy.lesson31.config;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.synergyitacademy.lesson31.Rights;
import ru.synergyitacademy.lesson31.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

@Configuration
@RequiredArgsConstructor
@ComponentScan("ru.synergyitacademy.lesson31")
@PropertySource("classpath:application_bkp.properties")
public class JavaConfiguration {

    private final ru.synergyitacademy.lesson31.config.service.PropertyService propertyService;

    @Bean
    public User admin() {
        final User user = new User(1L, "Ivanov");
        user.setRights(List.of(Rights.WRITE, Rights.READ));
        return user;
    }

    @Bean
    public User guest() {
        final User user = new User(admin().getId(), "Sidorov");
        user.setRights(List.of(Rights.READ));
        return user;
    }

    @SneakyThrows
    @Bean(destroyMethod = "close")
    public Connection sqlConnection(@Value("${db.url}") String dbUrl,
                                    @Value("${db.login}") String login,
                                    @Value("${db.password}") String password) {
        return DriverManager.getConnection(dbUrl, login, password);
    }
}
