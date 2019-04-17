package com.fortiate.generator.dataelements;

import java.util.HashMap;

public class DE043 extends DataElement  {
	

	
private static int id = 43;
private static String name = "Card Acceptor Name and Location";
private static String shortName = "CANL";


public DE043(int key)
{
	super(id,calculate(key),name,shortName);
	
}

private static String calculate(int key)
{
	HashMap<Integer, String> canlMap;
	canlMap = new HashMap<Integer, String>();

	canlMap.put(1, "TPS*CLEARTRIP PRIVATE  MUMBAI        IND");
	canlMap.put(2, "HOTEL GOMTI              LUCKNOW      IN");
	canlMap.put(3, "SRAVYA TOURS AND TRAVE   HYDERABAD    IN");
	canlMap.put(4, "VODAFONE-BILLDESK        MUMBAI       IN");
	canlMap.put(5, "THE MOBILE WALLET        JAIPUR       IN");
	canlMap.put(6, "UNIVERSITY               HYDERABAD    IN");
	canlMap.put(7, "BAJAJFINANCE             MUMBAI       IN");
	canlMap.put(8, "WWW OXIGENWALLET COM     0012430540   IN");
	canlMap.put(9, "AMAZON PAY INDIA PRIVA   BANGALORE    IN");	
	canlMap.put(10,"AIRTEL PYMT-BILLDESK     MUMBAI       IN");
	canlMap.put(11,"BHARTI AIRTEL LIMITED-AVEMUMBAI       IN");
	canlMap.put(12,"NMJB - GADDA DA VIDA     MUMBAI       IN");
	canlMap.put(13,"RSP*RAZORPAY GROFERS I JAIPUR        IND");
	canlMap.put(14,"RAJA RAJESHWARI          BANGALORE    IN");
	canlMap.put(15,"PAY*PAYU MONEY         GURGAON       IND");
	canlMap.put(16,"HOTEL GOMTI              LUCKNOW      IN");
	canlMap.put(17,"PAYTM                    Noida        IN");
	canlMap.put(18,"ROSHNI SERVICES        PUNE          IND");
	canlMap.put(19,"MOBIKWIK                 NEW DELHI    IN");
	canlMap.put(20,"Payu Payments Pvt ltd    Gurgaon      IN");
	canlMap.put(21,"AMAZON ONLINE D S PVT  8033420300    IND");
	canlMap.put(22,"TORRENTPOWER           MUMBAI        IND");
	canlMap.put(23,"ONE97 COMMUNICATIONS L NOIDA         IND");
	canlMap.put(24,"PTM*PAYTM              NOIDA         IND");
	canlMap.put(25,"VARUN ENTERPRISES SHELL PCHENNAI      IN");
	canlMap.put(26,"WWW OXIGENWALLET COM     0012430540   IN");	
	canlMap.put(27,"AMAZON SELLER SERVICES PRIVATE LTD-PG   ");
	canlMap.put(28,"SINGH SAAB DI RASOI    SURAT         IND");
	canlMap.put(29,"OVEN FRESH               CHENNAI      IN");
	canlMap.put(30,"MAKEMYTRIP INDIA PVT L   NEW DELHI    IN");
	canlMap.put(31,"RAM SERVICE STATION      NEW DELHI    IN");
	canlMap.put(32,"SHELL SRI SAI BALAJI E BANGALORE     IND");
	canlMap.put(33,"http://hoichoi.tv        MUMBAI       IN");
	canlMap.put(34,"LAKE FOREST WINES 30     GURGAON      IN");
	canlMap.put(35,"ONE PLACE HOTEL          HYDERABAD    IN");
	canlMap.put(36,"ONE97 COMMUNICATIONS LIMINOIDA        IN");
	canlMap.put(37,"NETFLIX                  MUMBAI       IN");
	canlMap.put(38,"RAMJI FAMILY RESTAURAN   THANE        IN");
	canlMap.put(39,"AMAZON SELLER SERVICES PRIVATE LTD-PG   ");
	canlMap.put(40,"HOUSE OF COMMONS         BANGALORE    IN");
	canlMap.put(41,"PAY*WWW OLACABS COM    GURGAON       IND");
	canlMap.put(42,"SHOPCLUES.COM            GURGAON      IN");
	canlMap.put(43,"MYNTRA DESIGN PVT LTD    MUMBAI       IN");
	canlMap.put(44,"ONE97 COMMUNICATIONS L NOIDA         IND");
	canlMap.put(45,"AMAZON ONLINE D S PVT LTD8033420300   IN");
	canlMap.put(46,"PLAZA PREMIUM,,        NEW DELHI     IND");
	canlMap.put(47,"AIRTEL PYMT-BILLDESK     MUMBAI       IN");
	canlMap.put(48,"VODAFONE-BILLDESK        MUMBAI       IN");
	canlMap.put(49,"CESC                     MUMBAI       IN");


	
	return canlMap.get(key);
}



}
