package com.fortiate.generator.dataelements;

import java.util.HashMap;
import java.util.Random;

public class DE003SE1 extends SubElement {
	
	private static double id = 3.1;
	private static String name = "Transaction Type";
	private static String shortName = "Txn Type";
	private static String description = "";

	public DE003SE1(String de3s1)
	{
		super(id,calculate(de3s1),name,shortName,description);
	}
	
	private static String calculate(String de3s1)
	{

		String key12;

		HashMap<String, String> digit12;
		digit12 = new HashMap<String, String>();

		digit12.put("00", "Purchase");
		digit12.put("01", "Cash withdrawal, Cash at POS / Cash advance");
		digit12.put("09", "Purchase with Cashback");
		digit12.put("10", "Biometric Verification");
		digit12.put("14", "EMI");
		digit12.put("20", "Credit/Refund");
		digit12.put("21", "Deposit");
		digit12.put("22", "Credit Adjustment");
		digit12.put("26", "Original Credit Transaction (OCT)");
		digit12.put("27", "Loyalty Redemption");
		digit12.put("28", "Money Load Transaction (qSPARC)");
		digit12.put("31", "Balance Enquiry");
		digit12.put("36", "Loyalty Inquiry");
		digit12.put("37", "Aadhar Inquiry");
		digit12.put("40", "Fund Transfer");
		digit12.put("81", "ARQC Validation and ARPC Generation – Onus Scenario");
		digit12.put("83", "Service Creation (qSPARC)");
		digit12.put("90", "Extended Transaction Type (used for Mini Statement and Pin Change, Card to Card Funds transfer)");

		// Get a random entry from the hashtable.
		String[] keys12 = digit12.keySet().toArray(new String[digit12.size()]);


		if(de3s1.isEmpty())
		{  
			key12 =  keys12[new Random().nextInt(keys12.length)];

		}
		else 
		{
			key12 = de3s1;
		}
		
		description = digit12.get(key12);


		return key12;
	}
}
