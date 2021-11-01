package ru.synergyitacademy.lesson37.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.synergyitacademy.lesson37.entity.Emp;
import ru.synergyitacademy.lesson37.repository.EmpRepository;

@Service
@RequiredArgsConstructor
public class EmpService {

    private final EmpRepository employeeRepository;

    public Emp findById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

}
