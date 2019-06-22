package com.zzx.springboot.SpringBootFirst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zzx.springboot.SpringBootFirst.domain.City;
import com.zzx.springboot.SpringBootFirst.service.CityService;

@Controller()
@RequestMapping("/user")
public class MainController {
	
	@Autowired
	private CityService citySrv;
	
	@RequestMapping("/list")
	//@ResponseBody
	public String list(Model map) {
		System.out.println("MainController.list start.");
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("sss", "2sdfsdfwel");
		
		//map.addAttribute("name", "zzx");
		
		List<City> list = citySrv.findAll();
		System.out.println("MainController.list end.");
		map.addAttribute("cityList", list);
		return "list";
	}
	
	@RequestMapping("/add")
	public String add(@RequestParam("id")Integer id, @RequestParam("name")String name, Model map) {
		System.out.println("MainController.add start.");
		City city = new City();
		city.setId(id);
		city.setName(name);
		
		String success = citySrv.save(city);
		map.addAttribute("success", success);
		System.out.println("MainController.add end.");
		return "add";
	}
	
	@RequestMapping("/addPage")
	public String addPage() {
		return "add";
	}
	

}
