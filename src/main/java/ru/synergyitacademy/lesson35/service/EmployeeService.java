package ru.synergyitacademy.lesson35.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.synergyitacademy.lesson28.entity.Department;
import ru.synergyitacademy.lesson28.entity.Employee;
import ru.synergyitacademy.lesson35.projection.EmployeeProject;
import ru.synergyitacademy.lesson35.repository.EmployeeRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Employee> findByDepartmentId(Integer departmentId) {
        final List<EmployeeProject> employees = employeeRepository.findEmployeeByDepartmentId(departmentId);
        return employees.stream().map(projection -> {
            Employee employee = new Employee();
            employee.setId(projection.getEmpId());
            employee.setEmpName(projection.getEmpName());
            employee.setSalary(projection.getSalary());
            if (projection.getDepartmentId() != null && projection.getDepartmentName() != null) {
                employee.setDepartment(new Department(projection.getDepartmentId(), projection.getDepartmentName()));
            }
            return employee;
        }).collect(Collectors.toList());
    }

    @Transactional
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }
}
