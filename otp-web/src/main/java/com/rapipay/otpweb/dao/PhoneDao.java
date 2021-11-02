package com.rapipay.otpweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rapipay.otpweb.entity.PhoneNumber;

import javax.persistence.*;


public interface PhoneDao extends JpaRepository<PhoneNumber, Integer>{

}
