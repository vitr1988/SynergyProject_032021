package ru.synergyitacademy.lesson35.projection;

import java.math.BigDecimal;

public interface EmployeeProject {

    Integer getEmpId();
    String getEmpName();
    BigDecimal getSalary();
    Integer getDepartmentId();
    String getDepartmentName();
}
