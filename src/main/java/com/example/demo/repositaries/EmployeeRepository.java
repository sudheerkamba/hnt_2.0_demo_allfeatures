package com.example.demo.repositaries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	

}
