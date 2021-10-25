package ru.synergyitacademy.lesson35;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.MessageSource;
import ru.synergyitacademy.lesson28.entity.Employee;
import ru.synergyitacademy.lesson35.service.EmployeeService;

import java.math.BigDecimal;
import java.util.Locale;

@Slf4j
@EntityScan("ru.synergyitacademy.lesson28.entity")
@SpringBootApplication
public class SpringBootAdvancedRunner {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(SpringBootAdvancedRunner.class, args);

//        final ResourceBundle resourceBundle = context.getBean(ResourceBundle.class);
//        System.out.println(resourceBundle.getString("application.name"));
        final MessageSource messageSource = context.getBean(MessageSource.class);
        log.info(messageSource.getMessage("application.name", null, Locale.ENGLISH));
        log.info(messageSource.getMessage("application.greeting", new Object[]{"Vitaly", "Have a nice day"}, Locale.getDefault()));

        final EmployeeService employeeService = context.getBean(EmployeeService.class);
        final Employee employee = employeeService.findByNameAndSalary("Petrov", BigDecimal.valueOf(180_000));
        log.info("Founded employee has id {}, salary {} and department id {} name {} ", employee.getId(), employee.getSalary(),
                employee.getDepartment() == null ? null : employee.getDepartment().getId(), employee.getDepartment() == null ? null : employee.getDepartment().getName());

        employee.setSalary(BigDecimal.valueOf(180_000));
        employeeService.save(employee);

        final Employee otherEmployee = employeeService.findById(employee.getId());
        log.info("New founded employee with id {} has salary {}", otherEmployee.getId(), otherEmployee.getSalary());
    }
}
