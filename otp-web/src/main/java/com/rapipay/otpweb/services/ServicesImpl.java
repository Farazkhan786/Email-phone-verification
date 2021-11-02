package com.rapipay.otpweb.services;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.rapipay.otpproject.entity.Email;
import com.rapipay.otpweb.dao.EmailDao;

@Service
public class ServicesImpl implements AllServices{
	
	@Autowired
    private JavaMailSender javaMailSender;
	
	@Autowired
	private EmailDao emaildao;

	@Override
	public List<Email> getAllEmail() {
		
		return emaildao.findAll();
	}

	@Override
	public Email getByEmail(String email) {
		
		return emaildao.findById(email).orElse(null);
	}

	@Override
	public Email addEmail(Email email) {
		return emaildao.save(email);
}
	void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("to_1@gmail.com", "to_2@gmail.com", "to_3@yahoo.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");

        javaMailSender.send(msg);
	}

	
	
}
