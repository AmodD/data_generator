package com.fortiate.generator.dataelements;

import java.util.HashMap;
import java.util.Random;

public class DE018 extends DataElement {
	
	
private static int id = 18;
private static String name = "Merchant Category Code";
private static String shortName = "MCC";
private static String description = "";



public DE018(String network)
{
	super(id,calculate(network),name,shortName,description);
	
}

private static String calculate(String network)
{
	HashMap<String, String> mccMap;
	mccMap = new HashMap<String, String>();

	mccMap.put("0742", "Veterinary Services");
	mccMap.put("0763", "Agricultural Co-operatives");
	mccMap.put("0780", "Horticultural Services, Landscaping Services");
	mccMap.put("1520", "General Contractors-Residential and Commercial");
	mccMap.put("1711", "Air Conditioning Contractors – Sales and Installation, Heating Contractors – Sales, Service, Installation");
	mccMap.put("1731", "Electrical Contractors");
	mccMap.put("2741", "Miscellaneous Publishing and Printing");
	mccMap.put("3003", "Airlines");
	mccMap.put("3020", "AIR-INDIA");
	mccMap.put("3389", "AVIS RENT-A-CAR");
	mccMap.put("3504", "HILTON HOTELS");
	mccMap.put("3509", "MARRIOTT HOTELS");
	mccMap.put("4829", "Money Orders – Wire Transfer");
	mccMap.put("4784", "Toll and Bridge Fees");
	mccMap.put("4900", "Electric, Gas, Sanitary and Water Utilities");
	mccMap.put("5251", "Hardware Stores");
	mccMap.put("5411", "Grocery Stores, Supermarkets");
	mccMap.put("5732", "Electronic Sales");
    
	// Get a random entry from the hashtable.
    String[] keys = mccMap.keySet().toArray(new String[mccMap.size()]);
    
    String key = keys[new Random().nextInt(keys.length)];
    
    description = mccMap.get(key);

    
    return key ;

	
}

}