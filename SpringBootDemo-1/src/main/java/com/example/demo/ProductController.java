package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/amazon")
public class ProductController {
	
	@GetMapping(value = "/prduct")
	public String CreatProduct() {
		return "welcome to springboot with pcf";
	}

}
