package ru.synergyitacademy.lesson28.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@ToString(exclude = {"employees"})
@Entity
@Table(name = "department")
public class Department {

    @Id
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
