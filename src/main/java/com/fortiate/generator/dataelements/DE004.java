package com.fortiate.generator.dataelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class DE004 extends DataElement {
	
	
private static int id = 4;
private static String name = "Transaction Amount";
private static String shortName = "Txn Amnt";


public DE004(String network, String de3se1)
{
	super(id,calculate(network,de3se1),name,shortName);
	
}

private static String calculate(String network, String de3se1)
{
	
	if(network.equalsIgnoreCase("rupay")) return rupay( de3se1);
	else return "not implemented";
	
}


private static String rupay( String de3se1)
{
	if(de3se1.equalsIgnoreCase("31") || de3se1.equalsIgnoreCase("10") ) return "000000000000";
	// TODO : generate a 12 digit random number prepended with leading zeroes
	else return String.format("%012d", getRandomNumberInts(100,200000)); 
	
}

public static int getRandomNumberInts(int min, int max){
 
	HashMap<Integer, Integer> rangeMap;
	rangeMap = new HashMap<Integer, Integer>();

	rangeMap.put(100, 1000);
	rangeMap.put(200, 5000);
	rangeMap.put(50, 500);
	rangeMap.put(300, 20000);
	rangeMap.put(10, 1000);
	rangeMap.put(4000, 50000);
	rangeMap.put(500, 1000);
	rangeMap.put(600, 200000);
	
	
    // Get a random entry from the hashtable.	
	Object[] rangeMapKeys = rangeMap.keySet().toArray();
	Object key = rangeMapKeys[new Random().nextInt(rangeMapKeys.length)];
	int value = rangeMap.get(key);

	
	Random random = new Random();
	return random.ints((int)key,(value+1)).findFirst().getAsInt();
  
	
	//return random.ints(min,(max+1)).findFirst().getAsInt();
}


}
