package com.example.StudentDemo.entity;

import jakarta.persistence.*;


@Entity
@Table(name="Departments")
public class Department
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deptId;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public Department(String name) {
        this.name = name;
    }

    public Department(){}

    @OneToOne
    @JoinColumn(name="student_id")
    private Student student;

    public void setStudent(Student student)
    {
        this.student=student;

    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
