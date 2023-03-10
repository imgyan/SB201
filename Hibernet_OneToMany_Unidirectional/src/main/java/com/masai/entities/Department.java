package com.masai.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int deptId;
    private String dname;
    private String location;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name="dept_emp",joinColumns=@JoinColumn(name="did"),inverseJoinColumns=@JoinColumn(name
            ="eid"))
    private List<Employee> emp=new ArrayList<>();

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", dname='" + dname + '\'' +
                ", location='" + location + '\'' +
                ", emp=" + emp +
                '}';
    }
}
