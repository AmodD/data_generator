package com.fortiate.generator.dataelements;

import java.util.ArrayList;
import java.util.List;

public abstract class DataElement {
	
	public DataElement(int id, String value, String name, String shortName) {
		super();
		this.id = id;
		this.value = value;
		this.name = name;
		this.shortName = shortName;
	}
	
	public DataElement(int id, String value, String name, String shortName, String description) {
		super();
		this.id = id;
		this.value = value;
		this.name = name;
		this.shortName = shortName;
		this.description = description;

	}
	
	public DataElement(int id, String value, String name, String shortName, String description, List<SubElement> subElements) {
		super();
		this.id = id;
		this.value = value;
		this.name = name;
		this.shortName = shortName;
		this.subElements = subElements;
		this.description = description;

	}

	private int id;
	private String value;
	private String name;
	private String shortName;
	private String description="";

	List<SubElement> subElements = new ArrayList<SubElement>();
	

	public DataElement()
	{
		
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

	public List<SubElement> getSubElements() {
		return subElements;
	}

	public void setSubElements(List<SubElement> subElements) {
		this.subElements = subElements;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}












	
	
}
