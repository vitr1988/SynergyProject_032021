package ru.synergyitacademy.lesson35.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.synergyitacademy.lesson28.entity.Employee;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findEmployeesByEmpName(String name);

    List<Employee> findEmployeesByEmpNameAndSalary(String name, BigDecimal salary);

    @Query("select e from Employee e " +
           "join fetch e.department " +
           "where e.id = :i" )
    Employee findEmployeeById(@Param("i") Integer id);
}
