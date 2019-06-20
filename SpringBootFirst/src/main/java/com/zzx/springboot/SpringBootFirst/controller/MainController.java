package com.zzx.springboot.SpringBootFirst.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@RequestMapping("/user")
public class MainController {
	
	@RequestMapping("/list")
	//@ResponseBody
	public String list(ModelMap map) {
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("sss", "2sdfsdfwel");
		
		map.addAttribute("name", "zzx");
		return "list";
	}
	

}
