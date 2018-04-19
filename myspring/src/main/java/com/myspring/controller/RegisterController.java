package com.myspring.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class RegisterController {
	@RequestMapping("/ajaxForm")
	public @ResponseBody String ajaxFormController(String uname,String upassword){
		
	//	UUser uu = new UUser("sspu","abc");
		return uname;
	}

}
