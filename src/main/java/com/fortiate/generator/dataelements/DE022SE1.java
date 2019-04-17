package com.fortiate.generator.dataelements;

import java.util.HashMap;
import java.util.Random;

public class DE022SE1 extends SubElement  {

	private static double id = 22.1;
	private static String name = "Permanent Account Number Entry Mode";
	private static String shortName = "PAN Entry Mode";
	private static String description = "";

	
	public DE022SE1()
	{
		super(id,calculate(),name,shortName,description);
	}
	
	private static String calculate()
	{
		HashMap<String, String> panemMap;
		panemMap = new HashMap<String, String>();

		panemMap.put("00", "PAN entry mode unknown");
		panemMap.put("01", "Manual");
		panemMap.put("02", "Magnetic Stripe Read");
		panemMap.put("03", "Barcode reader");
		panemMap.put("04", "Optical card reader");
		panemMap.put("05", "ICC");
		panemMap.put("06", "IVR");
		panemMap.put("07", "Contactless payment using chip card.");
		panemMap.put("08", "QR code");
		panemMap.put("09", "NFC");
		panemMap.put("10", "Bluetooth low energy (BLE)");
		panemMap.put("80", "Fallback Transactions");
		panemMap.put("81", "E-commerce");
		panemMap.put("90", "Full and Unaltered magnetic stripe read(enables CVD validation)");
		panemMap.put("91", "Contactless using CVD, iCVD checking possible.");
		panemMap.put("95", "Chip card with unreliable CVD or iCVD");
		panemMap.put("99", "Reserved for RuPay");
		
        // Get a random entry from the hashtable.
        String[] keys = panemMap.keySet().toArray(new String[panemMap.size()]);
        
        String key = keys[new Random().nextInt(keys.length)];
        
        description = panemMap.get(key);
        
        return key;	
        
	}
}
