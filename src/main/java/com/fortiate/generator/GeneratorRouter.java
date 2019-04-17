package com.fortiate.generator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class GeneratorRouter {
	

	@Bean
	@CrossOrigin
	public RouterFunction<ServerResponse> route(GeneratorHandler generatorHandler) {

		return RouterFunctions			
			.route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), generatorHandler::hello)
			.andRoute(RequestPredicates.GET("/de2/rupay").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), generatorHandler::de2Rupay)
			.andRoute(RequestPredicates.GET("/rupay/balance_enquiry").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), generatorHandler::rupayBalanceEnquiry)
			.andRoute(RequestPredicates.GET("/rupay/purchase").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), generatorHandler::rupayPurchase); 

		
	}


}
