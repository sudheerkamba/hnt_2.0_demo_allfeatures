package com.example.demo.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private int age;
private double salary;
private String gender;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender + "]";
}
public Employee() {
	
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, int age, double salary, String gender) {
	this(   name,  age,  salary,  gender) ;
	this.id = id;
	
}
public Employee( String name, int age, double salary, String gender) {
	super();
	
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.gender = gender;
}

}
