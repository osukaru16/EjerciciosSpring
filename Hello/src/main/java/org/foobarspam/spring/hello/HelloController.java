package org.foobarspam.spring.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	
	@RequestMapping(path="/")
	@ResponseBody
	public String saludo(){
		return "Hey mundo";
	}
	
	@RequestMapping(path="/miau")
	@ResponseBody
	public String saludo2(){
		return "Hola mike";
	}

	
	

}
