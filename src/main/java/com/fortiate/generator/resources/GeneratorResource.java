package com.fortiate.generator.resources;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.stream.Stream;

import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fortiate.generator.model.de2;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class GeneratorResource {
	
	// TODO Return an empty Mono
	@GetMapping("/de2test")
	@CrossOrigin
	public Mono<String> emptyMono() {
		
		Mono<String> de2mono = Mono.just("hello2");
		return de2mono;
	}

	@GetMapping("/de2")
	@CrossOrigin
	public Publisher<de2> de2Publisher(@RequestParam String network) {
		Mono<de2> de2Mono = Mono.just((new de2(network)));
		return de2Mono;
	}

	// https://github.com/dhananjay12/spring-reactive/tree/master/reactive-web/src/main/java/com/example/reactive/reactiveweb
	 
}
