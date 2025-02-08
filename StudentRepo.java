package com.example.StudentDemo.repo;

import com.example.StudentDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer>
{
}
