package ru.synergyitacademy.lesson5;

import java.time.LocalDate;

public class EmployeeRunner {

    public static void main(String[] args) {
        Employee ivanov = new Employee("Иванов Иван Иванович",
                LocalDate.now(), 100_000, 40);
//        ivanov.age = 40;
        Department ivanovDepartment = new Department();
        ivanovDepartment.name = "IT-отдел";
        ivanov.setDepartment(ivanovDepartment);

        System.out.println(ivanov);
        ivanov.increaseCompensation(50_000);
        System.out.println(ivanov);

        Employee notUsableEmployee = null;
        System.out.println(notUsableEmployee);
    }
}
