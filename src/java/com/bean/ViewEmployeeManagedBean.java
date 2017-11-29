/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.domain.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Talon
 */
@ManagedBean
@SessionScoped
public class ViewEmployeeManagedBean implements java.io.Serializable{
    
    private List<Employee> employees = new ArrayList<>();
    
    @PostConstruct
    public void populate(){
        for(int i=0; i<10; i++){
            employees.add(new Employee(String.valueOf(i), "Employee #"+i));
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
}
