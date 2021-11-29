package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Employee;
import com.example.demo.exceptions.EmployeeException;
import com.example.demo.repositaries.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;
 public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
	 System.out.println(repo.findAll());
		return repo.findAll();
	}

 	@Cacheable(value = "employeeStore",key="#id")
	public Employee getEmployee(@PathVariable int id) throws EmployeeException {
		// TODO Auto-generated method stub
 		System.out.println("Service: finding employee by id("+id+")");
		Optional<Employee> emp=repo.findById(id);
		if(emp.isPresent())
			return emp.get();
		else
		throw new EmployeeException("NO EMployee Found");
	}

	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@CachePut(value="employeeStore",key="#id")
	public Employee updateEmplyee(Employee emp,int id) {
		// TODO Auto-generated method stub
		
		return repo.save(emp);
		
	}

	
	@CacheEvict(key="#id")
	public void removeEmployee(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	

}
