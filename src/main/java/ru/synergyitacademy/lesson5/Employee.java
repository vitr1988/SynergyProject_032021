package ru.synergyitacademy.lesson5;

import java.time.LocalDate;

public class Employee {

    String fullName;
    LocalDate birthDay;
    double salary;
    int age;
    Department department;

    public Employee(String fullName, LocalDate birthDay, double salary, int age) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.salary = salary;
        this.age = age;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", salary=" + salary +
                ", age=" + age +
                ", department=" + department +
                '}';
    }

    public void increaseCompensation(double summa) {
        this.salary += summa;
    }
}
