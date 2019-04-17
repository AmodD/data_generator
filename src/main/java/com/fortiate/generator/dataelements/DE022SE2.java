package com.fortiate.generator.dataelements;

import java.util.HashMap;
import java.util.Random;

public class DE022SE2 extends SubElement  {
	

	private static double id = 22.2;
	private static String name = "Personal Identification Number Entry Capability";
	private static String shortName = "PIN Entry Capability";
	private static String description = "";

	
	public DE022SE2()
	{
		super(id,calculate(),name,shortName,description);
	}
	
	private static String calculate()
	{
		HashMap<String, String> pinecMap;
		pinecMap = new HashMap<String, String>();

		pinecMap.put("0", "Unspecified");
		pinecMap.put("1", "PIN Entry Capability");
		pinecMap.put("2", "No PIN Entry Capability");
		pinecMap.put("6", "PIN pad inoperative");
		pinecMap.put("8", "Reserved for RuPay");
		pinecMap.put("9", "Reserved for private use(Biometric entry capability)");
		
        // Get a random entry from the hashtable.
        String[] keys = pinecMap.keySet().toArray(new String[pinecMap.size()]);
        
        String key = keys[new Random().nextInt(keys.length)];	
        
        description = pinecMap.get(key);
        
        return key;
        
	}

}
