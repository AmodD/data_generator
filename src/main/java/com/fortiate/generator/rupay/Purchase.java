package com.fortiate.generator.rupay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.fortiate.generator.dataelements.DataElement;
import com.fortiate.generator.GeneratorWebClient;
import com.fortiate.generator.dataelements.DE0;
import com.fortiate.generator.dataelements.DE002;
import com.fortiate.generator.dataelements.DE003;
import com.fortiate.generator.dataelements.DE004;
import com.fortiate.generator.dataelements.DE018;
import com.fortiate.generator.dataelements.DE022;
import com.fortiate.generator.dataelements.DE041;
import com.fortiate.generator.dataelements.DE042;
import com.fortiate.generator.dataelements.DE043;
import com.fortiate.generator.dataelements.DE048;

public class Purchase extends Transaction {


	private static String network = "rupay";
	private static String de3Digit12 = "00";
	private static String de3Digit34 = "00";
	private static String de3Digit56 = "00";
	

	
	
	public Purchase(String mti)
	{
		super(prepare(mti),network, dataElements);
		
	}
	
	private static String prepare(String mti)
	{
		Random random = new Random();
		int cardAcceptorKey = random.ints(1,49).findFirst().getAsInt();
	    dataElements.clear();

	    DE0 de0 = new DE0(mti);
	    DE002 de2 = new DE002(network);
	    DE003 de3 = new DE003(network, de3Digit12,de3Digit34,de3Digit56);
	    DE004 de4 = new DE004(network,"");
	    DE018 de18 = new DE018(network);
	    DE022 de22 = new DE022();
	    DE041 de41 = new DE041(cardAcceptorKey);
	    DE042 de42 = new DE042(cardAcceptorKey);
	    DE043 de43 = new DE043(cardAcceptorKey);
	    DE048 de48 = new DE048();
	    
		dataElements.add(de0);
		dataElements.add(de2);
		dataElements.add(de3);
		dataElements.add(de4);
		dataElements.add(de18);
		dataElements.add(de22);
		dataElements.add(de41);
		dataElements.add(de42);
		dataElements.add(de43);
		dataElements.add(de48);

		
		
		deHM.put("0", de0.getValue().toString());
		deHM.put("2", de2.getValue().toString());
		deHM.put("3", de3.getValue().toString());
		deHM.put("4", de4.getValue().toString());
		deHM.put("18", de18.getValue().toString());
		deHM.put("22", de22.getValue().toString());
		deHM.put("41", de41.getValue().toString());
		deHM.put("42", de42.getValue().toString());
		deHM.put("43", de43.getValue().toString());
		deHM.put("48", de48.getValue().toString());

		
	//	GeneratorWebClient gwc = new GeneratorWebClient();
	//	System.out.println(gwc.getResult());

//		Properties config = new Properties();
//		//config.put("client.id", InetAddress.getLocalHost().getHostName());
//		//config.put("bootstrap.servers", "PLAINTEXT://ec2-18-206-151-30.compute-1.amazonaws.com:9092");
//		config.put("bootstrap.servers", "localhost:9092");
//		config.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//		//config.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//		config.put("value.serializer", JsonSerializer.class);
//
//		config.put("acks", "all");
//		KafkaProducer<String, String> kafkaProducer = new KafkaProducer<String,String>(config);
//		final ProducerRecord<String,String> producerRecord = new ProducerRecord<>("test", "somekey2", dataElements);
//		kafkaProducer.send(producerRecord);
		
		return "";
	}

	@Override
	public String toString() {
		return "Purchase [message=" + message + ", network=" + network + "]";
	}







}
