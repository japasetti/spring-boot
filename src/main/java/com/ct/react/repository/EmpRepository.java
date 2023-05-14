package com.ct.react.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ct.react.model.Employee;

public interface EmpRepository  extends JpaRepository<Employee, Long>{

}
