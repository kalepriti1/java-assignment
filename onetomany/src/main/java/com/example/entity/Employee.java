package com.example.entity;

import jakarta.persistence.*;
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String designatioin;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "deptId")
    private Department department;

    public Employee() {
    }

    public Employee( String name, String designatioin, Department department) {
        this.name = name;
        this.designatioin = designatioin;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignatioin() {
        return designatioin;
    }

    public void setDesignatioin(String designatioin) {
        this.designatioin = designatioin;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
