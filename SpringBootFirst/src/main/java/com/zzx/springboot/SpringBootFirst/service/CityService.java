package com.zzx.springboot.SpringBootFirst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzx.springboot.SpringBootFirst.dao.CityDao;
import com.zzx.springboot.SpringBootFirst.domain.City;

@Service
public class CityService {

	@Autowired
	private CityDao cityDao;
	
	public List<City> findAll() {
		System.out.println("CityService.findAll start.");
		List<City> citylist = cityDao.findAll();
		System.out.println("CityService.findAll end.");
		return citylist;
	}

	public String save(City city) {
		System.out.println("CityService.save start.");
		try {
			if(isNotExit(city.getId())) {
				cityDao.save(city);
				System.out.println("CityService.save end.");
				return "save OK.";
			} else {
				System.out.println("CityService.save end.");
				return "save error.";
			}
		} catch (Exception e) {
			System.out.println("CityService.save end.");
			return "save error.";
		}
	}
	
	public boolean isNotExit(Integer id) throws Exception {
		System.out.println("CityService.findCity start.");
		City city = cityDao.findById(id);
		if(city != null) {
			return false;
		}
		System.out.println("CityService.findCity end.");
		return true;
	}

}
