package com.myspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myspring.model.UUser;
@Controller
public class RegisterController {
	@RequestMapping("/ajaxForm")
	public @ResponseBody UUser ajaxFormController(UUser uu){
		System.out.println(uu.getUname());
	//	UUser uu = new UUser("sspu","abc");
		return uu;
	}

}
