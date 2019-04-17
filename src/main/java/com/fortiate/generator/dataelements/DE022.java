package com.fortiate.generator.dataelements;

import java.util.ArrayList;
import java.util.List;

public class DE022 extends DataElement {
	
	private static int id = 22;
	private static String name = "Point Of Service Entry Mode";
	private static String shortName = "POS Entry Mode";
	private static String description = "";
	static List<SubElement> subElements = new ArrayList<SubElement>();
	
	public DE022()
	{
		super(id,calculate(),name,shortName,description,subElements);
	}

	private static String calculate()
	{
		DE022SE1 DE22SE1 = new DE022SE1();
		DE022SE2 DE22SE2 = new DE022SE2();
	
		subElements.clear();
		subElements.add(DE22SE1);
		subElements.add(DE22SE2);
		
		description = DE22SE1.getShortName() + " : " + DE22SE1.getDescription() + " | " +
				      DE22SE2.getShortName() + " : " + DE22SE2.getDescription() + " | ";
		
		return DE22SE1.getValue() + DE22SE2.getValue();
	}
}
