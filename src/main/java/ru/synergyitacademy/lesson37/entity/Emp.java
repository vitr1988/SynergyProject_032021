package ru.synergyitacademy.lesson37.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "employee")
public class Emp {

    @Id
    private Integer empId;

    private String empName;
}
