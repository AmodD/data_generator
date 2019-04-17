package com.fortiate.generator.dataelements;

public abstract class SubElement {
	
	public SubElement(double id, String value, String name, String shortName, String description) {
		super();
		this.id = id;
		this.value = value;
		this.name = name;
		this.shortName = shortName;
		this.description = description;
	}

	private double id;
	private String value;
	private String name;
	private String shortName;
	private String description = "";

	

	public SubElement()
	{
		
	}
	
	public SubElement(double id,String value, String name, String shortName) {
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

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}










	
	
}
