package com.fortiate.generator.resources;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Future;
import java.util.stream.Stream;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.TopicPartition;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.support.SendResult;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fortiate.generator.DataElementsSender;
import com.fortiate.generator.dataelements.DataElement;
import com.fortiate.generator.dataelements.de2;
import com.fortiate.generator.dataelements.de3;
import com.fortiate.generator.rupay.Purchase;
import com.fortiate.generator.rupay.Transaction;
import com.google.gson.Gson;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class GeneratorResource {
	
	// TODO Return an empty Mono
	@GetMapping("/")
	@CrossOrigin
	public Mono<String> emptyMono() {
		
		System.out.println("in emptyMono");

		Mono<String> de2mono = Mono.just("<h1>API Reference Index V2</h1><hr><br><a target='_blank' href='https://generator.fortiate.com:8081/de2?network=rupay'> GET random DE2 </a><br> ");
		return de2mono;
	}

	@GetMapping("/de2")
	@CrossOrigin
	public Publisher<de2> de2Publisher(@RequestParam String network) {
		System.out.println("in de2");

		Mono<de2> de2Mono = Mono.just((new de2(network)));
		return de2Mono;
	}
	
	@GetMapping("/de3")
	@CrossOrigin
	public Publisher<de3> de3Publisher(@RequestParam String network) {
		Mono<de3> de3Mono = Mono.just((new de3(network,"")));
		return de3Mono;
	}
	
    @Autowired
    private DataElementsSender dataELementsSender;
    
	@GetMapping("/isomessages")
	@CrossOrigin
	public Mono<String> isoMessages() {
			    	
	        String isoMessage = "" ;

			Properties config = new Properties();
			//config.put("bootstrap.servers", "localhost:9092");
			config.put("bootstrap.servers", "PLAINTEXT://kafka.fortiate.com:9092");


			config.put("group.id", "console-consumer-16055");
			config.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
			config.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
			
	        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<String, String>(config);

	        String topic = "txn-msg";
	        TopicPartition topicPartition = new TopicPartition(topic, 0);
	        List<TopicPartition> topicPartitions = Arrays.asList(topicPartition);
	        kafkaConsumer.assign(topicPartitions);
	        
	        //kafkaConsumer.seek(topicPartition, kafkaConsumer.position(topicPartition));
	        long currentPosition = kafkaConsumer.position(topicPartition);
	        kafkaConsumer.seek(topicPartition, currentPosition -1);
	        
	        System.out.println("currentPosition - " + currentPosition);
	        System.out.println(kafkaConsumer);
	        
	       	        
	        ConsumerRecords<String, String> crecords = kafkaConsumer.poll(Duration.ofMillis(10000));
	        
	        if(false) {
	        long current = kafkaConsumer.position(topicPartition);
	        long end = current;
	        current -= 1000;
	        if(current < 0) current = 0;
	        kafkaConsumer.seek(topicPartition, current);
	        List<String> result = new ArrayList<>();
	        while (current < end) {
	            System.out.println("topic position = "+current);
	            ConsumerRecords<String, String> records = kafkaConsumer.poll(1000);
	            for (ConsumerRecord<String, String> record : records) {
	                result.add(record.value());
	                System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
	            }
	            current = kafkaConsumer.position(topicPartition);
	        }
	        }//if false
	        
	        for (ConsumerRecord<String, String> crecord : crecords) {
                System.out.printf("offset = %d, key = %s, value = %s%n", crecord.offset(), crecord.key(), crecord.value());

	        	isoMessage = crecord.value();
	        	
	        }
	        
		    
	        Mono<String> de2mono = Mono.just(isoMessage);

		    
	        
	        kafkaConsumer.close();
	        
	        return de2mono;
	        
     		//Mono<String> de2mono = Mono.just(record.value());
	        
	        //return Response.ok().entity(result).build();

		//return null;

		
		
	}
	
	@GetMapping("/rupay/purchase")
	@CrossOrigin
	public Publisher<Transaction> purchasePublisher() {
		
		System.out.println("in purchasePublisher");
		Transaction transaction = new Purchase();
		Mono<Transaction> purchaseMono = Mono.just((transaction));
		
		System.out.println("before gson");

		 // create a new Gson instance
		 Gson gson = new Gson();
		 // convert your list to json
		 String jsonDataElementList = gson.toJson(transaction.getDataElements());
		
		Properties config = new Properties();
		//config.put("client.id", InetAddress.getLocalHost().getHostName());
		config.put("bootstrap.servers", "PLAINTEXT://kafka.fortiate.com:9092");
		//config.put("bootstrap.servers", "localhost:9092");
		config.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		//config.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		config.put("value.serializer", JsonSerializer.class);

		System.out.println("after setting initial properties ");

		config.put("acks", "all");
		KafkaProducer<String, HashMap> kafkaProducer = new KafkaProducer<String,HashMap>(config);
		final ProducerRecord<String,HashMap> producerRecord = new ProducerRecord<>("data-elements", "somekey2", transaction.getDeHM());

		System.out.println("before sending ");

		kafkaProducer.send(producerRecord);
		
		if(false) {
		config.put("group.id", "console-consumer-16055");
		config.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		config.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<String, String>(config);
        List<String> topics = new ArrayList<String>();
        topics.add("txn-msg");
        kafkaConsumer.subscribe(topics);
        
        ConsumerRecords<String, String> records = kafkaConsumer.poll(Duration.ofMillis(1000));
		
        for (ConsumerRecord<String, String> record: records){
            System.out.println(String.format("Topic - %s, Partition - %d, Value: %s", record.topic(), record.partition(), record.value()));

        }
        
		}
		
		//dataELementsSender.send(transaction.getDataElements());
		
		System.out.println("end of method");

		return purchaseMono;
	}	

	// https://github.com/dhananjay12/spring-reactive/tree/master/reactive-web/src/main/java/com/example/reactive/reactiveweb
	 
}
