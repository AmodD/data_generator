package com.fortiate.generator.rupay;

import com.fortiate.generator.dataelements.DE0;
import com.fortiate.generator.dataelements.DE002;
import com.fortiate.generator.dataelements.DE003;
import com.fortiate.generator.dataelements.DE004;

public class BalanceEnquiry  extends Transaction  {

	private static String network = "rupay";
	private static String de3se1 = "31";
	
	
	public BalanceEnquiry(String mti)
	{
		super(prepare(mti),network, dataElements);
		
	}
	
	private static String prepare(String mti)
	{
	    dataElements.clear();

	    DE0 de0 = new DE0(mti);
	    DE002 de2 = new DE002(network);
	    DE003 de3 = new DE003(network, de3se1);
	    DE004 de4 = new DE004(network,de3se1);

	    
		dataElements.add(de0);
		dataElements.add(de2);
		dataElements.add(de3);
		dataElements.add(de4);

		
		deHM.put("0", de0.getValue().toString());
		deHM.put("2", de2.getValue().toString());
		deHM.put("3", de3.getValue().toString());
		deHM.put("4", de4.getValue().toString());

		

		
		return "";
	}


}
