package com.ahi.sbl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahi.sbl.pojo.Credential;
import com.ahi.sbl.services.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {

	@Autowired
	LoginService service;

	@PostMapping(value = "/login", consumes = { "application/json" })
	public Credential index(@RequestBody Credential credential) {
		return service.getToken(credential);
	}

	@PostMapping(value = "/sblToken", consumes = { "application/json" })
	public Credential sblToken(@RequestBody Credential credential) {
		return service.getTokenWithSecrets(credential);
	}
}
