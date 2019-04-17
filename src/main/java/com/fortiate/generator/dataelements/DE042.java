package com.fortiate.generator.dataelements;

import java.util.HashMap;

public class DE042 extends DataElement  {
	

	
private static int id = 42;
private static String name = "Merchant Identifier - Card Acceptor ID";
private static String shortName = "MID";


public DE042(int key)
{
	super(id,calculate(key),name,shortName);
	
}

private static String calculate(int key)
{
	HashMap<Integer, String> midMap;
	midMap = new HashMap<Integer, String>();

	midMap.put(1, "CLEARTRIP68943");
	midMap.put(2, "470000097028401");
	midMap.put(3, "SRAVYA31323");
	midMap.put(4, "222774412227744");
	midMap.put(5, "THEMOBIL1241872");
	midMap.put(6, "UNIVERSITY");
	midMap.put(7, "BAJAJFINANCE");
	midMap.put(8, "89050049");
	midMap.put(9, "99010126");
	midMap.put(10,"223110032231100");
	midMap.put(11,"224919122249191");
	midMap.put(12,"000999000006867");
	midMap.put(13,"GROFERS1179790");
	midMap.put(14,"RAJA");
	midMap.put(15," PAYUPAISA47779");
	midMap.put(16,"470000097028401");
	midMap.put(17,"470000000218923");
	midMap.put(18,"ROSHNI");
	midMap.put(19,"MOBIKWIK51969");
	midMap.put(20,"493197100001847");
	midMap.put(21,"89050036");
	midMap.put(22,"TORRENTPOWER");
	midMap.put(23,"113604821136048");
	midMap.put(24,"PAYTM97998");
	midMap.put(25,"000214227233881");
	midMap.put(26,"89050049");
	midMap.put(27,"9820730315");
	midMap.put(28,"000022690031370");
	midMap.put(29,"470000050770993");
	midMap.put(30,"99010092");
	midMap.put(31,"");
	midMap.put(32,"470000050794454");
	midMap.put(33,"470000087001006");
	midMap.put(34,"470000050762175");
	midMap.put(35,"470000074660614");
	midMap.put(36,"113604821136048");
	midMap.put(37,"NETFLIX1258398");
	midMap.put(38,"037022003276150");
	midMap.put(39,"9820730315");
	midMap.put(40,"000044690095932");
	midMap.put(41,"OLACABS62398");
	midMap.put(42,"CLUES57856");
	midMap.put(43,"MYNTRA72883");
	midMap.put(44,"113604821136048");
	midMap.put(45,"89050036");
	midMap.put(46,"PLAZA");
	midMap.put(47,"223110032231100");
	midMap.put(48,"222774412227744");
	midMap.put(49,"CESC");


	
	return midMap.get(key);
}



}
