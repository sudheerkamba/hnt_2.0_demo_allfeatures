package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SampleTest {
	@GetMapping("/get")
	public String get() {
		return "Welcome boby";
	}

}
