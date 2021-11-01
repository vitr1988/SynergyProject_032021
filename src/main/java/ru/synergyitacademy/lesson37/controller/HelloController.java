package ru.synergyitacademy.lesson37.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.synergyitacademy.lesson37.entity.Emp;
import ru.synergyitacademy.lesson37.service.EmpService;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final EmpService employeeService;

    @GetMapping("/hello/{id}")
    public Emp hello(@PathVariable Integer id) {
        return employeeService.findById(id);
    }
}
