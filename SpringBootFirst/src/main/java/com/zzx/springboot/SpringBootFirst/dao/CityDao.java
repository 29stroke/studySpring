package com.zzx.springboot.SpringBootFirst.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;

import com.zzx.springboot.SpringBootFirst.domain.City;

@Controller
public class CityDao {

	static Map<Integer, City> map = Collections.synchronizedMap(new HashMap<Integer, City>());
	public List<City> findAll() {
		System.out.println("CityDao.findAll start.");
		ArrayList<City> cityList = new ArrayList<>(map.values());
		System.out.println("CityDao.findAll end.");
		return cityList;
	}
	
	public void save(City city) throws Exception {
		System.out.println("CityDao.save start.");
		try {
			System.out.println(city.getId());

			map.put(city.getId(), city);
		}catch (Exception e) {
			System.out.println("CityDao.save end.");
			throw new Exception("add map error.");
		}
		System.out.println("CityDao.save end.");
	}
	
	public City findById(Integer id) {
		System.out.println("CityDao.findById start.");
		City city = map.get(id);
		System.out.println("CityDao.findById end.");
		return city;
	}

	public List<City> delById(Integer id) {
		System.out.println("CityDao.delById start.");
		map.remove(id);
		ArrayList<City> cityList = new ArrayList<>(map.values());
		System.out.println("CityDao.delById end.");
		return cityList;
	}

	public List<City> updByName(Integer id, String name) {
		System.out.println("CityDao.updByName start.");
		City city = new City();
		city.setId(id);
		city.setName(name);
		map.put(id, city);
		ArrayList<City> cityList = new ArrayList<>(map.values());
		System.out.println("CityDao.updByName end.");
		return cityList;
	}

}
