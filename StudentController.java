package com.example.StudentDemo.controller;

import com.example.StudentDemo.dto.updateStd;
import com.example.StudentDemo.entity.Student;
import com.example.StudentDemo.service.StudentService;
import jakarta.servlet.ServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/std")
public class StudentController
{
    @Autowired
    StudentService service;

    @PostMapping("/create-student")
    public Student addStudent(@RequestBody Student student)
    {
        service.addStudent(student);
        return student;
    }


    @GetMapping("/all")
    public List<Student> getAllStudent()
    {
        List<Student> allStudent = service.getAllStudent();
        return allStudent;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id)
    {
        List<Student> allStudent = getAllStudent();
        service.deleteStudent(id,allStudent);

    }
    @GetMapping
    public Student getStudentById(@RequestParam Integer id)
    {
        List<Student> all = service.getAllStudent();
        Student student=new Student();
        for(Student data:all)
        {
            if(data.getId()==id)
            {
                service.getByID(id);
                student=data;

            }
        }
        return student;


    }

    @PatchMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody updateStd update)
    {
        return service.updateStd(id,update);
    }

}
