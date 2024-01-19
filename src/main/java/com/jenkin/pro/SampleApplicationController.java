package com.jenkin.pro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleApplicationController {
	
	@GetMapping
	public String getMap() {
		return "Hello World...";
	}

}
