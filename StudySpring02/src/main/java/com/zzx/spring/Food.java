package com.zzx.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Food {

	private Properties propertiesName;
	private List listName;
	private Map mapName;
	private Set setName;

	private String name;

	public Food(String name) {
		super();
		this.name = name;
	}
	
	public Food() {
		super();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Properties getPropertiesName() {
		return propertiesName;
	}

	public void setPropertiesName(Properties propertiesName) {
		this.propertiesName = propertiesName;
	}

	public List getListName() {
		return listName;
	}

	public void setListName(List listName) {
		this.listName = listName;
	}

	public Map getMapName() {
		return mapName;
	}

	public void setMapName(Map mapName) {
		this.mapName = mapName;
	}

	public Set getSetName() {
		return setName;
	}

	public void setSetName(Set setName) {
		this.setName = setName;
	}
}
