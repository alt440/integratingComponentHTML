package com.cors.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


//maven unknown error when creating new project
//https://stackoverflow.com/questions/56154266/why-does-change-from-spring-boot-version-2-1-4-to-2-1-5-gives-unknown-configurat

//THE ONLY REASON WHY A STRING RETURNS A PAGE IS BECAUSE THYMELEAF HAS BEEN INCLUDED IN THE PROJECT!
@Controller
public class CorsController {

	@CrossOrigin(origins= {"*"},allowedHeaders="true")
	@GetMapping("/")
	public String getPage() {
		return "importer";
	}
	
	@GetMapping("/error")
	public String getPageError() {
		return "error";
	}
	
	@GetMapping("/component.html")
	public String getComponent() {
		return "component";
	}
}
