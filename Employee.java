package com.example.StudentDemo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee
{
    @Id
    private int empId;
    private String empName;
    private int age;

    @OneToMany(mappedBy = "employee" ,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Address> addressList=new ArrayList<>();

    public Employee(int empId, String empName, int age, List<Address> addressList) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.addressList = addressList;
    }

    public Employee(){}

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }


}
