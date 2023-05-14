package com.ct.react.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ct.react.model.Employee;

public interface EmployeeService 
{
	    List<Employee> getAllEmp();
	    
	    Employee saveEmplyoee(Employee emp);
	    
	    ResponseEntity<Employee> getEmpById(@PathVariable long id);
		
	    ResponseEntity<Employee> updateEmp(@PathVariable long id, @RequestBody Employee details);
	    
	    ResponseEntity<Employee> deleteEmp(@PathVariable long id);
	    
 }
