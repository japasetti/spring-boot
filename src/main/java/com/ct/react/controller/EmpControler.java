package com.ct.react.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ct.react.errors.ResourceNotFoundException;
import com.ct.react.model.Employee;
import com.ct.react.repository.EmpRepository;
import com.ct.react.service.EmployeeServiceImp;

@CrossOrigin("*")
@RestController
@RequestMapping("/show")
public class EmpControler {

	@Autowired
	EmployeeServiceImp service;

	@GetMapping("/all/data")
	public List<Employee> getAllEmployee() {
		/* return repo.findAll(); */
        return service.getAllEmp();
	}

	@PostMapping("/create")
	public Employee createResource(@RequestBody Employee emp) {
		
	  return service.saveEmplyoee(emp);
	  
	}

	@GetMapping("{id}")
	public ResponseEntity<Employee> getById(@PathVariable long id) {
	
	  return service.getEmpById(id);
	
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee details) {
	
		
		return service.updateEmp(id, details);
		
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> deleteEmp(@PathVariable long id) {
		
		return service.deleteEmp(id);

	}

}
