package com.rapipay.otpweb.entity;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PhoneNumber {
	@Id
	String phoneNumber;
	LocalDateTime generatedTime;
	LocalDateTime expiryTime;
	int otp;
	public PhoneNumber(String phoneNumber, int otp) {
		super();
		this.phoneNumber = phoneNumber;
		this.generatedTime = LocalDateTime.now();
		this.expiryTime = LocalDateTime.now().plus(Duration.of(10, ChronoUnit.MINUTES));
		this.otp = otp;
	}
	public PhoneNumber() {
		super();
	}
	

}
