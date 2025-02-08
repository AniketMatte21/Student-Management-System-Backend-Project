package com.example.StudentDemo.service;

import com.example.StudentDemo.entity.Department;
import com.example.StudentDemo.entity.Student;
import com.example.StudentDemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OneToOneDemo
{
    @Autowired
    StudentRepo repo;
   public void OneToOne()
   {
       Student std=new Student();
       std.setName("Radhika");
       std.setEmail("radhauplanchiwar@gmail.com");
       std.setAge(20);


       Department dep=new Department();
       dep.setName("Information Technology");
       std.setDepartment(dep);
       dep.setStudent(std);

       repo.save(std);

       Student student = repo.findById(2).get();
       String name = student.getName();
       Department department = student.getDepartment();

       System.out.println(name+" "+department.getName()+" madhe ahe");
   }

}
