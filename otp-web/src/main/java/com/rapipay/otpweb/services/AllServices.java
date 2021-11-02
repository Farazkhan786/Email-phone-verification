package com.rapipay.otpweb.services;

import java.util.List;

import com.rapipay.otpproject.entity.Email;

public interface AllServices {
	
	 List<Email> getAllEmail();
	
	 Email getByEmail(String email) ;
	 
	 Email addEmail(Email email);
	 
	 
	 
	 
	
	

}

