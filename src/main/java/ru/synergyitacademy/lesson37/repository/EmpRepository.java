package ru.synergyitacademy.lesson37.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.synergyitacademy.lesson37.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer> {
}
