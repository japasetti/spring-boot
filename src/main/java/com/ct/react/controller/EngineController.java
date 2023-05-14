package com.ct.react.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.react.model.Engine;
import com.ct.react.repository.EngineRepository;
import com.ct.react.service.EngineService;

@RestController
@CrossOrigin("*")
public class EngineController {
	
	@Autowired
	private EngineService service;
	
    public EngineController(EngineService service) {
		super();
		this.service = service;
	}

	@GetMapping("/engine/details")
	public List<Engine> getAllData()
	{
		return	service.getAllEmp();
	}
    
    @PostMapping("/create/resource")
    public Engine createEngineData(@RequestBody Engine engine) 
    {    	
    	return service.saveEmplyoee(engine);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Engine> getById(@PathVariable long id)
    {
	
    	return service.getEmpById(id);
    }
    @PutMapping("/update/{id}")
	public ResponseEntity<Engine> updateEngine(@PathVariable long id, @RequestBody Engine engine)
	{
    	
    	return service.updateEmp(id, engine);
	}
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Engine> deleteById(@PathVariable long id)
    {
		
    	return service.deleteEmp(id);
    }
    
}
