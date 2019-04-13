package com.fortiate.generator.rupay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.fortiate.generator.dataelements.DataElement;
import com.fortiate.generator.dataelements.de0;
import com.fortiate.generator.dataelements.de2;
import com.fortiate.generator.dataelements.de3;

public class Purchase extends Transaction {


	private static String network = "rupay";
	private static String de3Digit12 = "00";

	
	
	public Purchase(String mti)
	{
		super(prepare(mti),network, dataElements);
		
	}
	
	private static String prepare(String mti)
	{
	    dataElements.clear();

	    de0 de0 = new de0(mti);
	    de2 de2 = new de2(network);
	    de3 de3 = new de3(network, de3Digit12);
	    
		dataElements.add(de0);
		dataElements.add(de2);
		dataElements.add(de3);
		
		deHM.put("0", de0.getValue().toString());
		deHM.put("2", de2.getValue().toString());
		deHM.put("3", de3.getValue().toString());
		deHMJson.put("de0", de0.getValue().toString());
		deHMJson.put("de2", de2.getValue().toString());
		deHMJson.put("de3", de3.getValue().toString());
		
		
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
