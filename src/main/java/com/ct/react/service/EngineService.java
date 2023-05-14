package com.ct.react.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ct.react.model.Employee;
import com.ct.react.model.Engine;

public interface EngineService {
	
	List<Engine> getAllEmp();
    
    Engine saveEmplyoee(Engine emp);
    
    ResponseEntity<Engine> getEmpById(@PathVariable long id);
	
    ResponseEntity<Engine> updateEmp(@PathVariable long id, @RequestBody Engine details);
    
    ResponseEntity<Engine> deleteEmp(@PathVariable long id);
  

}
