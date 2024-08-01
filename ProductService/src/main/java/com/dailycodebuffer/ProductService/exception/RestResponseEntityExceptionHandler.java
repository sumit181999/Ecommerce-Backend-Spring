package com.dailycodebuffer.ProductService.exception;

import com.dailycodebuffer.ProductService.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//@ControllerAdvice is an annotation in Spring Framework that allows you to define global advice (interceptors) 
//for your Spring MVC controllers. It is commonly used for centralizing exception handling, model 
//attributes, and other concerns that need to be applied globally to multiple controllers. 
//The annotated class can contain methods annotated with @ExceptionHandler, @InitBinder, and @ModelAttribute, providing a way to share common functionality across multiple controllers.
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ProductServiceCustomException.class)
	public ResponseEntity<ErrorResponse> handleProductServiceException(ProductServiceCustomException exception) {
		return new ResponseEntity<>(new ErrorResponse() .builder().errorMessage(exception.getMessage())
				.errorCode(exception.getErrorCode()).build(), HttpStatus.NOT_FOUND);
	}
}