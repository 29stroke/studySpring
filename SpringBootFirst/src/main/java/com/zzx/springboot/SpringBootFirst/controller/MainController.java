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
		map.addAttribute("cityList", list);
		System.out.println("MainController.list end.");
		return "list";
	}
	
	@RequestMapping("/delete")
	public String del(Model map, @RequestParam("id")Integer id) {
		System.out.println("MainController.Del start.");
		
		List<City> list = citySrv.delById(id);
		map.addAttribute("cityList", list);
		System.out.println("MainController.Del end.");
		return "list";
	}
	
	@RequestMapping("/updata")
	public String updata(Model map, @RequestParam("id")Integer id, @RequestParam("name")String name) {
		System.out.println("MainController.updata start.");
		
		List<City> list = citySrv.updByName(id, name);
		map.addAttribute("cityList", list);
		System.out.println("MainController.updata end.");
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
