package com.example.StudentDemo.repo;

import com.example.StudentDemo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer>
{

}
