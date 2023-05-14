package com.ct.react.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ct.react.errors.ResourceNotFoundException;

import com.ct.react.model.Engine;
import com.ct.react.repository.EngineRepository;

@Service
public class EngineServiceImp implements EngineService {

	@Autowired
	EngineRepository repo;

	public EngineServiceImp(EngineRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Engine> getAllEmp() {

		List<Engine> engine = repo.findAll();

		return engine;
	}

	@Override
	public Engine saveEmplyoee(Engine emp) {

		return repo.save(emp);
	}

	@Override
	public ResponseEntity<Engine> getEmpById(long id) {

		Engine engine = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Engine data doesnot exists+id"));
		return ResponseEntity.ok(engine);
	}

	@Override
	public ResponseEntity<Engine> updateEmp(long id, Engine details) {

		Engine update = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Engine data doesnot exists+id"));

		update.setType(details.getType());
		update.setName(details.getName());
		update.setMaterial(details.getMaterial());
		update.setCost(details.getCost());

		repo.save(update);

		return ResponseEntity.ok(update);

	}

	@Override
	public ResponseEntity<Engine> deleteEmp(long id) {

		Engine engine = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Engine data doesnot exists+id"));

		repo.delete(engine);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
