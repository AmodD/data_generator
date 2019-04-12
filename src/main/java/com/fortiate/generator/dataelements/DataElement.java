package com.fortiate.generator.dataelements;

import java.util.ArrayList;
import java.util.List;

public abstract class DataElement {
	
	private int id;
	private String value;
	private String name ;
	private String shortName ;

	public DataElement()
	{
		
	}
	
	public DataElement(int id,String value, String name, String shortName) {
		super();
		this.id = id;
		this.value = value;
		this.name = name;
		this.shortName = shortName;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}










	
	
}
