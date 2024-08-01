package com.dailycodebuffer.OrderService.external.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dailycodebuffer.OrderService.external.decoder.CustomErrorDecoder;

import feign.codec.ErrorDecoder;

// Basically this class will tell that instead of using ErrorDecoder use CustomErrorDecoder
@Configuration
public class FeignConfig {
	
	@Bean
	ErrorDecoder errorDecoder() {
		return new CustomErrorDecoder();
	}
}
