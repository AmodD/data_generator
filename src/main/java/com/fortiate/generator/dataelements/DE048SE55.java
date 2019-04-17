package com.fortiate.generator.dataelements;

import java.util.HashMap;
import java.util.Random;

public class DE048SE55 extends SubElement {

	
	private static double id = 48.55;
	private static String name = "Payments Indicator";
	private static String shortName = "PI";
	private static String description = "";
	
	private static String tag = "055";
	private static String length = "002";

	
	public DE048SE55()
	{
		super(id,calculate(),name,shortName,description);
	}
	
	private static String calculate()
	{
		HashMap<String, String> piMap;
		piMap = new HashMap<String, String>();

		piMap.put("01", "Recurring Payment");
		piMap.put("02", "Installment Payment");
		
        // Get a random entry from the hashtable.
        String[] keys = piMap.keySet().toArray(new String[piMap.size()]);
        
        String key = keys[new Random().nextInt(keys.length)];	
        
        description = piMap.get(key);

		return tag + length + key;
	}


}
