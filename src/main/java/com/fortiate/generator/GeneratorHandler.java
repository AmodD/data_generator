package com.fortiate.generator;

import java.util.concurrent.TimeUnit;

import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.fortiate.generator.dataelements.DE002;
import com.fortiate.generator.rupay.BalanceEnquiry;
import com.fortiate.generator.rupay.Purchase;

import reactor.core.publisher.Mono;

@Component
public class GeneratorHandler {


	public Mono<ServerResponse> hello(ServerRequest request) {
		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
			.body(BodyInserters.fromObject("Hello, Spring!"));
	}
	


	public Mono<ServerResponse> api(ServerRequest request) {
		return ServerResponse.ok().contentType(MediaType.TEXT_HTML)
			.body(BodyInserters.fromObject("<h1>API Reference Index</h1><hr>"
					+ " GET <a href='http://generator.fortiate.com:8081/de2/rupay' target='_blank'>/de2/rupay </a>"
					+ "<br><br>"
					+ " GET <a href='http://generator.fortiate.com:8081/rupay/purchase' target='_blank'>/rupay/purchase </a>"
					+ "<br><br>"
					+ " GET <a href='http://generator.fortiate.com:8081/rupay/purchase' target='_blank'>/rupay/balance_enquiry </a>"));
	}
	
	public Mono<ServerResponse> de2Rupay(ServerRequest request) {
		
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
			.body(BodyInserters.fromObject(new DE002("rupay")));
	}	
	
	@CrossOrigin
	public Mono<ServerResponse> rupayPurchase(ServerRequest request) {
		
		//TimeUnit.SECONDS.sleep(5);

		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
			.body(BodyInserters.fromObject(new Purchase("0100")));
	}
	
	public Mono<ServerResponse> rupayBalanceEnquiry(ServerRequest request) {
		
		//TimeUnit.SECONDS.sleep(5);

		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
			.body(BodyInserters.fromObject(new BalanceEnquiry("0100")));
	}
	
}
