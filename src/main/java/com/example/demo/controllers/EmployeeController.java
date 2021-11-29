package com.example.demo.controllers;

import java.time.LocalDateTime;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.exceptions.EmployeeException;
import com.example.demo.services.EmployeeService;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return service.getEmployees();
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) throws EmployeeException {
		System.out.println("Controller Get : found id by ("+id+") at "+LocalDateTime.now());
		return service.getEmployee(id);
		
	}
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee emp) {
		return service.createEmployee(emp);
		
	}
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@RequestBody Employee emp,@PathVariable int id) throws EmployeeException {
		Employee emp1=new Employee(id,  emp.getName(), emp.getAge(),emp.getSalary(), emp.getGender());
		return service.updateEmplyee(emp1,id);
	}
	@DeleteMapping("/employees/{id}")
	public void removeEmployee(@PathVariable int id) {
		service.removeEmployee(id);
	}
}
