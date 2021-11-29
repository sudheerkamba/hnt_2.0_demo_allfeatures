package com.example.demo;


import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Employee;
import com.example.demo.exceptions.EmployeeException;
import com.example.demo.services.EmployeeService;
import static org.hamcrest.Matchers.greaterThan;

@SpringBootTest
class TestService {

	@Autowired
	private EmployeeService service;
	@Test
	public void shouldGetEmployee() throws EmployeeException {
		int i=1;
		Employee emp= service.getEmployee(i);
		Assertions.assertNotNull(emp);
		Assertions.assertNotNull(emp.getGender());
		MatcherAssert.assertThat(emp.getId(),greaterThan(0));
		
	}
	@Test
	public void shouldNotGetEmployee() throws EmployeeException {
		int i=1010;
		Assertions.assertThrows(EmployeeException.class,()->service.getEmployee(i));
		
	}

}
