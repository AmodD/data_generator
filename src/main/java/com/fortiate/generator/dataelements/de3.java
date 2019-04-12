package com.fortiate.generator.dataelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class de3 extends DataElement {
		
	private static int id = 3;
	private static String name = "Processing Code";
	private static String shortName = "PC";
	
	public de3(String network, String de3Digit12)
	{
		super(id,calculate(network,de3Digit12),name,shortName);
		
	}
	
	private static String calculate(String network, String de3Digit12)
	{
		System.out.println(network);

		
		if(network.equalsIgnoreCase("rupay")) return rupay(de3Digit12);
		else return "not implemented";	
		
	}
	
	private static String rupay(String de3Digit12)
	{
		
		String digit123456 ;
		String key12;

		if(de3Digit12.isEmpty())
		{
			
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
        key12 = keys12[new Random().nextInt(keys12.length)];
		}
		else 
		{
			key12 = de3Digit12;
		}
		
		HashMap<String, String> digit34;
		digit34 = new HashMap<String, String>();

		digit34.put("00", "Unspecified/Unknown");
		digit34.put("10", "Savings");
		digit34.put("20", "Checking");
		digit34.put("30", "Credit Card");

        // Get a random entry from the hashtable.
        String[] keys34 = digit34.keySet().toArray(new String[digit34.size()]);
        String key34 = keys34[new Random().nextInt(keys34.length)];
		
		HashMap<String, String> digit56;
		digit56 = new HashMap<String, String>();

		digit56.put("00", "Unspecified/Unknown");
		digit56.put("10", "Savings");
		digit56.put("20", "Checking");
		digit56.put("30", "Credit Card");

        // Get a random entry from the hashtable.
        String[] keys56 = digit56.keySet().toArray(new String[digit56.size()]);
        String key56 = keys56[new Random().nextInt(keys56.length)];		
		
		return key12 + key34 + key56;
	}
	


}
