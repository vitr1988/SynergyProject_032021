package ru.synergyitacademy.lesson35.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.synergyitacademy.lesson28.entity.Employee;
import ru.synergyitacademy.lesson35.projection.EmployeeProject;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findEmployeesByEmpName(String name);

    List<Employee> findEmployeesByEmpNameAndSalary(String name, BigDecimal salary);

    @Query("select e from Employee e " +
            "join fetch e.department " +
            "where e.id = :i")
    Employee findEmployeeById(@Param("i") Integer id);

    @Query(value = "select e.emp_id empId, e.emp_name empName, e.salary, d.id departmentId, d.name departmentName from db.employee e " +
            " join db.department d on d.id = e.department_id " +
            "where d.id = :departmentId", nativeQuery = true)
    List<EmployeeProject> findEmployeeByDepartmentId(Integer departmentId);
}
