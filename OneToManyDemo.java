package com.example.StudentDemo.service;

import com.example.StudentDemo.entity.Address;
import com.example.StudentDemo.entity.Employee;
import com.example.StudentDemo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OneToManyDemo
{
    @Autowired
    EmployeeRepo employeeRepo;

    public void oneToMany()
    {
        Employee emp=new Employee();
        emp.setEmpId(101);
        emp.setEmpName("Aniket");
        emp.setAge(21);

        Address add1=new Address();
        add1.setAddressID(1);
        add1.setStreet("200/400");
        add1.setCity("Ind");
        add1.setEmployee(emp);

        Address add2=new Address();
        add2.setAddressID(2);
        add2.setStreet("200/500");
        add2.setCity("Ind");
        add2.setEmployee(emp);

        List<Address> list=new ArrayList<>();
        list.add(add1);
        list.add(add2);


        emp.setAddressList(list);
        employeeRepo.save(emp);

        Employee employee = employeeRepo.findById(101).get();
        List<Address> addressList = employee.getAddressList();
        System.out.println(addressList);

    }
}
