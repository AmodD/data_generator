package com.fortiate.generator.dataelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DE0 extends DataElement {

	private static int id = 0;
	private static String name = "Message Type Indicator";
	private static String shortName = "MTI";
	

	public DE0(String mti)
	{
		super(id,mti,name,shortName,getDescription(mti));
		
	}
	
	private static String getDescription(String mti)
	{
		
		HashMap<String, String> mtiMap;
		mtiMap = new HashMap<String, String>();

		// valuating
		mtiMap.put("0100", "Authorization Request Request from a point-of-sale terminal for authorization for a cardholder purchase");
		mtiMap.put("0110", "Authorization Response Request response to a point-of-sale terminal for authorization for a cardholder purchase");
		mtiMap.put("0120", "Authorization Advice When the point-of-sale device breaks down and you have to sign a voucher");
		mtiMap.put("0121", "Authorization Advice Repeat	If the advice times out");
		mtiMap.put("0130", "Issuer Response to Authorization Advice Confirmation of receipt of authorization advice");
		mtiMap.put("0200", "Acquirer Financial Request	Request for funds, typically from an ATM or pinned point-of-sale device");
		mtiMap.put("0210", "Issuer Response to Financial Request Issuer response to request for funds");
		mtiMap.put("0220", "Acquirer Financial Advice	e.g. Checkout at a hotel. Used to complete transaction initiated with authorization request");
		mtiMap.put("", "");
		mtiMap.put("", "");
		mtiMap.put("", "");
		mtiMap.put("", "");
		mtiMap.put("", "");
		mtiMap.put("", "");
		mtiMap.put("", "");
		mtiMap.put("", "");
		mtiMap.put("", "");
		mtiMap.put("", "");
		mtiMap.put("", "");
		
		return mtiMap.get(mti);
		
	}
	
}
