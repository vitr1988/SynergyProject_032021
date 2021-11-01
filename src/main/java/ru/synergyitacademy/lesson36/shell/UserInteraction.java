//package ru.synergyitacademy.lesson36.shell;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.MessageSource;
//import org.springframework.shell.Availability;
//import org.springframework.shell.standard.ShellComponent;
//import org.springframework.shell.standard.ShellMethod;
//import org.springframework.shell.standard.ShellMethodAvailability;
//import org.springframework.shell.standard.ShellOption;
//
//import java.util.Locale;
//
//@Slf4j
//@ShellComponent
//@RequiredArgsConstructor
//public class UserInteraction {
//
//    private final MessageSource messageSource;
//    private String username;
//
//    @ShellMethod(value = "Greeting of user", key = {"greet", "hello", "g", "h"})
//    public String greeting(@ShellOption({"-n, --name"}) String name) {
//        this.username = name;
//        return messageSource.getMessage("greeting", new Object[]{name}, Locale.getDefault());
//    }
//
//    @ShellMethod(value = "Execute command", key = {"exec", "e"})
//    @ShellMethodAvailability("isAvailable")
//    public void command(@ShellOption({"-p, --param", "--parameter"}) String parameter) {
//        log.info("Try to execute command with parameter {}", parameter);
//    }
//
//    private Availability isAvailable() {
//        return username == null
//                ? Availability.unavailable(messageSource.getMessage("error.logonFailed", null, Locale.getDefault()))
//                : Availability.available();
//    }
//
//}
