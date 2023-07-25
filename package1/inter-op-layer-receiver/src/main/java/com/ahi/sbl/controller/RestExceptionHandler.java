package com.ahi.sbl.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ahi.sbl.pojo.AhiInternalServerError;
import com.ahi.sbl.pojo.ErrResponse;

@RestControllerAdvice
class RestExceptionHandler {

	@ExceptionHandler(AhiInternalServerError.class)
	ResponseEntity<ErrResponse> postNotFound(AhiInternalServerError ex) {
		ErrResponse response = new ErrResponse();
		response.setError_code(ex.getError_code());
		response.setSuccess("false");
		response.setReturn_message(ex.getReturn_message());
		return ResponseEntity.ok(response);
	}

}