package com.guzman.hellohuman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController

public class HomeController {
	@RequestMapping("/")
    public String index(@RequestParam (value="name", required=false)String searchQuery) {
		if(searchQuery == null) {
			return "<h1>Hello Human!</h1>";
		}
		else {
			return "<h1>Hello " + searchQuery + "</h1>";
		}
	}


}
