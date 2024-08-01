package com.dailycodebuffer.ProductService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@Builder
@Log4j2
public class ErrorResponse {
	
    private String errorMessage;
    private String errorCode;
    public ErrorResponse() {
    	log.info("from ErrorResponse Class");	 //we can use log.info only inside some method or constructor
    }                                            //outside that we can't use that's why I make here constructor  
    
}