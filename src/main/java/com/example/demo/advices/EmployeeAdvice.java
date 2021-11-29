package com.example.demo.advices;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.dto.MyErrorResponse;
import com.example.demo.exceptions.EmployeeException;

@ControllerAdvice
public class EmployeeAdvice {
	@ExceptionHandler(EmployeeException.class)
public ResponseEntity<MyErrorResponse> handleEmpException(EmployeeException e){
		MyErrorResponse resp=new MyErrorResponse(e.getMessage(), LocalDateTime.now(), e);
	return new ResponseEntity<MyErrorResponse>(resp,HttpStatus.OK);
	
}
}
