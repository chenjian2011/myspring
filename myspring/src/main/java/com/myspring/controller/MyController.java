package com.myspring.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myspring.model.UUser;

@Controller
public class MyController {
	@RequestMapping("/first")
	public String getFirst(){
		return "firstpage";
	}
	@RequestMapping("/ajaxForm")
	public @ResponseBody UUser ajaxFormController(){
		System.out.println("fdsa");
		
		UUser uu = new UUser("sspu","abc");
		
		return uu;
	}
	

}
