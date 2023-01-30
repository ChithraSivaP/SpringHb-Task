package com.kg.crud.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.kg.crud.model.Employee;

@Repository
public class EmployeeRepository {
    
    private List<Employee> list = new ArrayList<Employee>(Arrays.asList(

            new Employee(1, "june 1", 10, 1000),
            new Employee(2, "arra 2", 20, 2000),
            new Employee(3, "abhey 3", 30, 3000)

));

    public List<Employee> getAllEmployees() {
        return list;
    }

    public Employee findById(int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == (id)) {
                return list.get(i);
            }
        }
        return null;
    }

    public List<Employee> search(String name) {
        return list.stream().filter(x -> x.getName().startsWith(name)).collect(Collectors.toList());
    }

    public Employee save(Employee p) {
        Employee employee = new Employee();
        employee.setId(p.getId());
        employee.setName(p.getName());
        employee.setPhonenum(p.getPhonenum());
        employee.setAddress(p.getAddress());
        list.add(employee);
        return employee;
    }

    public String delete(Integer id) {
        list.removeIf(x -> x.getId() == (id));
        return null;
    }

    public Employee update(Employee employee) {
        int idi = 0;
        int id = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == (employee.getId())) {
                id = employee.getId();
                idi = i;
                break;
            }
        }

        Employee employee1 = new Employee();
        employee1.setId(id);
        employee1.setName(employee.getName());
        employee1.setPhonenum(employee.getPhonenum());
        employee1.setAddress(employee.getAddress());
        list.set(idi, employee);
        return employee1;
    }
    
}
