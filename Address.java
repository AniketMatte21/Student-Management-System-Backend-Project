package com.example.StudentDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address
{
    @Id
    private int addressID;
    private String street;
    private String City;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    public Address(){}

    public Address(int addressID, String street, String city, Employee employee) {
        this.addressID = addressID;
        this.street = street;
        City = city;
        this.employee = employee;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressID=" + addressID +
                ", street='" + street + '\'' +
                ", City='" + City + '\'' +

                '}';
    }
}
