package com.rapipay.otpweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rapipay.otpproject.entity.Email;
import com.rapipay.otpweb.services.AllServices;

@RestController
public class OTPController {
	
	
	@Autowired
	private AllServices allservices;
	
	
	@GetMapping("/home")
	public String  home() {
		return "Afraagxkjahx";
	}
	
	
	@GetMapping("/email")
	public List<Email> getAllEmail(){
		return allservices.getAllEmail();
	}
	
	
	@GetMapping("/email/{email}")
	public Email getByEmail(@PathVariable String email ) {
	
		return allservices.getByEmail(email);
		
	}

	
	@PostMapping("/email")
	public Email addEmail(@RequestBody Email email ) {
		
		email.setGeneratedTime();
		email.setExpiryTime();
		return this.allservices.addEmail(email);
	}
}
