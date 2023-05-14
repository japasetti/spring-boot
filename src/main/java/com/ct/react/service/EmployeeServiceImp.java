package com.ct.react.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ct.react.errors.ResourceNotFoundException;
import com.ct.react.model.Employee;
import com.ct.react.repository.EmpRepository;

@Service
public class EmployeeServiceImp implements EmployeeService{

	 @Autowired
	 EmpRepository repo;
	
	public EmployeeServiceImp(EmpRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Employee> getAllEmp() {
		
		return repo.findAll();
	}

	@Override
	public Employee saveEmplyoee(Employee emp) {

		return repo.save(emp);
	}

	@Override
	public ResponseEntity<Employee> getEmpById(long id) {
		Employee employee = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exists with this id :" + id));
		return ResponseEntity.ok(employee);
	}

	@Override
	public ResponseEntity<Employee> updateEmp(long id, Employee details) {
		Employee updateEmployee = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exists with this id :" + id));

		updateEmployee.setFirstName(details.getFirstName());
		updateEmployee.setLastName(details.getLastName());
		updateEmployee.setEmailId(details.getEmailId());

		repo.save(updateEmployee);
		return ResponseEntity.ok(updateEmployee);

	}

	@Override
	public ResponseEntity<Employee> deleteEmp(long id) {
		Employee employee = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("requested emp does not exist" + id));
		repo.delete(employee);
		return new  ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
	}

	
}
