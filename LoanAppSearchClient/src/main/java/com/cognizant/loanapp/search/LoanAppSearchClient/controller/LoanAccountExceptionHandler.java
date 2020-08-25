package com.cognizant.loanapp.search.LoanAppSearchClient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cognizant.loanapp.search.LoanAppSearchClient.entity.LoanErrorResponse;
import com.cognizant.loanapp.search.LoanAppSearchClient.exception.LoanNotFoundException;

@ControllerAdvice
public class LoanAccountExceptionHandler {

	   Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// to handle the exception
		@ExceptionHandler
		public ResponseEntity<LoanErrorResponse> handleException(LoanNotFoundException exception){
			
			logger.info("Inside Exception handler method" );
			
			LoanErrorResponse error = new LoanErrorResponse();
			
			error.setStatus(HttpStatus.NOT_FOUND.value());		
			error.setMessage(exception.getMessage());
					
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
		
		// to catch other exceptions
		@ExceptionHandler
	    public ResponseEntity<LoanErrorResponse> handleException(Exception exception){
			
			logger.info("Inside Exception handler method of others" );
			
			LoanErrorResponse error = new LoanErrorResponse();
			
			error.setStatus(HttpStatus.BAD_REQUEST.value());		
			error.setMessage(exception.getMessage());
					
			return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
		}
}
