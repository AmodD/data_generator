package com.fortiate.generator.dataelements;

import java.util.HashMap;
import java.util.Random;

public class DE003SE3 extends SubElement {
	
	private static double id = 3.3;
	private static String name = "To Account";
	private static String shortName = "To Acct";
	private static String description = "";

	public DE003SE3()
	{
		super(id,calculate(),name,shortName,description);
	}
	
	private static String calculate()
	{
		
		HashMap<String, String> digit56;
		digit56 = new HashMap<String, String>();

		digit56.put("00", "Unspecified/Unknown");
		digit56.put("10", "Savings");
		digit56.put("20", "Checking");
		digit56.put("30", "Credit Card");

        // Get a random entry from the hashtable.
        String[] keys56 = digit56.keySet().toArray(new String[digit56.size()]);
        
        String key56 = keys56[new Random().nextInt(keys56.length)];
        description = digit56.get(key56);
        
        return key56;
	}
}