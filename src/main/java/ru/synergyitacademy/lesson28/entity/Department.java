package ru.synergyitacademy.lesson28.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "department")
public class Department {

    @Id
    private Integer id;

    private String name;

//    @OneToMany(mappedBy = "department")
//    private List<Employee> employees;
}
