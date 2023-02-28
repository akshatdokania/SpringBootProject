package com.signify.restcontroller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.signify.bean.CustomerOne;

@RestController
public class CustomerRestController {
	//normal method returning a string
	@GetMapping("/hello-world")
	public String helloWorld() {
		
		
		return "Hello World";
	}
	

	//returns java object returned as json	
	//this request mapping contains producing and consuming value
	//@method -> GET,POST,PUT AND DELETE
	//@produces and @consumes is the conversion of Object with JSON or XML
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.GET,
		    value = "/details")
		@ResponseBody
	 public CustomerOne details(){
		
		CustomerOne c1=new CustomerOne();
		c1.setId (101);
		c1.setName("ananas");
		c1.setAddress("Madras");
			
		
		return c1;
	}
}	
