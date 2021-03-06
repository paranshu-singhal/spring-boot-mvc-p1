package com.paranshusinghal.springmvc.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * RestController
 */
@Controller
public class RestController {

	@GetMapping(path = "/status")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public String status() {
		return "OMG The spring application is up and running";
	}
	
	@GetMapping(path = "/")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public String sayCheese() {
		return "Hallelujah!!";	

	}
	@PostMapping(path ="/login")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String handleUserLogin(ModelMap model, @RequestParam(required = false) String name, @RequestParam(required = false) String password) {
        
        model.put("name", name);
		model.put("password", password);
		return "welcome";
	}
}