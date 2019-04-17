package com.fortiate.generator.dataelements;

import java.util.ArrayList;
import java.util.List;

public class DE048 extends DataElement {
	
	private static int id = 48;
	private static String name = "Additional Data Element(Private)";
	private static String shortName = "DE48";
	private static String description = "";
	static List<SubElement> subElements = new ArrayList<SubElement>();
	
	public DE048()
	{
		super(id,calculate(),name,shortName,description,subElements);
	}
	
	private static String calculate()
	{
		
		DE048SE51 DE48SE51 = new DE048SE51();
		DE048SE55 DE48SE55 = new DE048SE55();

	
		subElements.clear();
		subElements.add(DE48SE51);
		subElements.add(DE48SE55);
		
		description = DE48SE51.getName() + " : " + DE48SE51.getDescription() + " | " +
				      DE48SE55.getName() + " : " + DE48SE55.getDescription() + " | ";
		
		return DE48SE51.getValue() + DE48SE55.getValue();
		
	}
	
}
