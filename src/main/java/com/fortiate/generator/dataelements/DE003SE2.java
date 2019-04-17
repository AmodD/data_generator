package com.fortiate.generator.dataelements;

import java.util.HashMap;
import java.util.Random;

public class DE003SE2 extends SubElement {
	
	private static double id = 3.2;
	private static String name = "From Account";
	private static String shortName = "From Acct";
	private static String description = "";


	public DE003SE2()
	{
		super(id,calculate(),name,shortName,description);
	}
	
	private static String calculate()
	{
		
		HashMap<String, String> digit34;
		digit34 = new HashMap<String, String>();

		digit34.put("00", "Unspecified/Unknown");
		digit34.put("10", "Savings");
		digit34.put("20", "Checking");
		digit34.put("30", "Credit Card");

        // Get a random entry from the hashtable.
        String[] keys34 = digit34.keySet().toArray(new String[digit34.size()]);
        
        String key34 = keys34[new Random().nextInt(keys34.length)];
        
        description = digit34.get(key34);
        
        return key34; 
	}
}
