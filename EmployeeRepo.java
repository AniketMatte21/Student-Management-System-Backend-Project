package com.example.StudentDemo.repo;

import com.example.StudentDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{
}
