package com.example.StudentDemo.service;

import com.example.StudentDemo.dto.updateStd;
import com.example.StudentDemo.entity.Student;
import com.example.StudentDemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService
{
    @Autowired
    StudentRepo repo;
    List<Student> list=new ArrayList<>();
    public void addStudent(Student student) {
        repo.save(student);
    }

    public List<Student> getAllStudent()
    {
        List<Student> all = repo.findAll();
        return all;
    }

    public void deleteStudent(int id,List<Student> list)
    {

        for(Student data:list)
        {
            if(data.getId()==id)
            {
                repo.deleteById(id);
            }

        }

    }

    public void  getByID(int id)
    {

        repo.findById(id);

    }

    public Student updateStd(int id, updateStd update)
    {

        Optional<Student> byId = repo.findById(id);
        Student save=null;
        if(byId.isPresent())
        {
            Student studentById = byId.get();
            studentById.setName(update.getName());
            studentById.setEmail(update.getEmail());
            studentById.setAge(update.getAge());
            save = repo.save(studentById);
        }
        else
        {
            System.out.println("not found");
        }
        return save;
    }




}
