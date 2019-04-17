package com.fortiate.generator.dataelements;

import java.util.HashMap;
import java.util.Random;

public class DE048SE51 extends SubElement {
	
	private static double id = 48.51;
	private static String name = "Product Code";
	private static String shortName = "PC";
	private static String description = "";
	
	private static String tag = "051";
	private static String length = "005";

	
	public DE048SE51()
	{
		super(id,calculate(),name,shortName,description);
	}
	
	private static String calculate()
	{
		HashMap<String, String> pcMap;
		pcMap = new HashMap<String, String>();

		pcMap.put("POS01", "Transaction Originated From POS");
		pcMap.put("ATM01", "Transaction Originated From ATM");
		pcMap.put("AEP01", "Transaction Originated From microATM");
		pcMap.put("IMP01", "Transaction Originated From Mobile");
		
        // Get a random entry from the hashtable.
        String[] keys = pcMap.keySet().toArray(new String[pcMap.size()]);
        
        String key = keys[new Random().nextInt(keys.length)];	
        
        description = pcMap.get(key);

		return tag + length + key;
	}


}
