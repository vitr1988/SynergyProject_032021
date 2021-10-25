package ru.synergyitacademy.lesson35.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.synergyitacademy.lesson28.entity.Employee;
import ru.synergyitacademy.lesson35.repository.EmployeeRepository;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee findById(Integer id) {
        return employeeRepository.findEmployeeById(id);
    }

    public Employee findByName(String name) {
        return employeeRepository.findEmployeesByEmpName(name)
                .stream().findFirst().orElseThrow(() -> new IllegalArgumentException("Такой сотрудник не найден"));
    }

    public Employee findByNameAndSalary(String name, BigDecimal salary) {
        return employeeRepository.findEmployeesByEmpNameAndSalary(name, salary)
                .stream().findFirst().orElseThrow(() -> new IllegalArgumentException("Такой сотрудник не найден"));
    }

    @Transactional
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }
}
