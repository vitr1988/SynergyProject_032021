package ru.synergyitacademy.lesson28.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "emp_id")
    @GeneratedValue//(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "emp_name", nullable = false)
    private String empName;

    private BigDecimal salary;

    @OneToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
