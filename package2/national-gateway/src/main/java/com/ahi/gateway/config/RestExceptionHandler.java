package com.ahi.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ahi.gateway.pojo.AhiException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@ControllerAdvice
class RestExceptionHandler {

	@Autowired
	ObjectMapper objectMapper;

	@ExceptionHandler(AhiException.class)
	ResponseEntity<String> handleFirst(AhiException ex) {

		try {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(objectMapper.writeValueAsString(ex));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("");
	}

}