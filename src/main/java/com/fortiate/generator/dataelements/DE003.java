package com.fortiate.generator.dataelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class DE003 extends DataElement {
		
	private static int id = 3;
	private static String name = "Processing Code";
	private static String shortName = "PC";
	static List<SubElement> subElements = new ArrayList<SubElement>();
	private static String description = "";

	
	
	public DE003()
	{
	
	}
	
	public DE003(String network, String de3se1)
	{
		
		
		super(id,calculate(network,de3se1),name,shortName,description,subElements);
		
	}
	
	
	private static String calculate(String network, String de3se1)
	{
		System.out.println(network);

		
		if(network.equalsIgnoreCase("rupay")) return rupay(de3se1);
		else return "not implemented";	
		
	}
	
	private static String rupay(String de3se1)
	{
		
		DE003SE1 DE3SE1 = new DE003SE1(de3se1);
		DE003SE2 DE3SE2 = new DE003SE2();
		DE003SE3 DE3SE3 = new DE003SE3();
	
		subElements.clear();
		subElements.add(DE3SE1);
		subElements.add(DE3SE2);
		subElements.add(DE3SE3);
		
		description = DE3SE1.getShortName() + " : " + DE3SE1.getDescription() + " | " +
				      DE3SE2.getShortName() + " : " + DE3SE2.getDescription() + " | " + 
				      DE3SE3.getShortName() + " : " + DE3SE3.getDescription();
		
		return DE3SE1.getValue() + DE3SE2.getValue() + DE3SE3.getValue() ;
	}
	


}
