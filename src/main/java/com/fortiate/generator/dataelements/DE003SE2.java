package com.fortiate.generator.dataelements;

import java.util.HashMap;
import java.util.Random;

public class DE003SE2 extends SubElement {
	
	private static double id = 3.2;
	private static String name = "From Account";
	private static String shortName = "From Acct";
	private static String description = "";


	public DE003SE2(String de3se2)
	{
		super(id,calculate(de3se2),name,shortName,description);
	}
	
	private static String calculate(String de3se2)
	{
		String key34;

		HashMap<String, String> digit34;
		digit34 = new HashMap<String, String>();

		digit34.put("00", "Unspecified/Unknown");
		digit34.put("10", "Savings");
		digit34.put("20", "Checking");
		digit34.put("30", "Credit Card");

        // Get a random entry from the hashtable.
        String[] keys34 = digit34.keySet().toArray(new String[digit34.size()]);
        
		if(de3se2.isEmpty())
		{  
			key34=  keys34[new Random().nextInt(keys34.length)];

		}
		else 
		{
			key34 = de3se2;
		}
        description = digit34.get(key34);
        
        return key34; 
	}
}
