package com.ct.react;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ct.react.model.Employee;
import com.ct.react.repository.EmpRepository;

@SpringBootApplication
public class SpringReactApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactApplication.class, args);
	}

	@Autowired
	private EmpRepository repo;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * object one Employee emp1=new Employee(); emp1.setFirstName("durga prasad");
		 * emp1.setLastName("japasetti"); emp1.setEmailId("durga13067@gmail.com");
		 * repo.save(emp1);
		 * 
		 * object two
		 * 
		 * Employee emp2=new Employee(); emp2.setFirstName("nani");
		 * emp2.setLastName("urstruly"); emp2.setEmailId("nani@gmail.com");
		 * repo.save(emp2);
		 */
	}

}
