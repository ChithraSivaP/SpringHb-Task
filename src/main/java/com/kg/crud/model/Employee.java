package com.kg.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "mock")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int phonenum;
    private double address;
   
   
  
    public Employee(int id, String name, int phonenum, double address) {
        this.id = id;
        this.name = name;
        this.phonenum = phonenum;
        this.address = address;
    }
    public Employee() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhonenum() {
        return phonenum;
    }
    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }
    public double getAddress() {
        return address;
    }
    public void setAddress(double address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", phonenum=" + phonenum + ", address=" + address + "]";
    }

    
}
