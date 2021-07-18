package com.tts.weatherapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ZipCode {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String code;
	
	public ZipCode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ZipCode(String code) {
		super();
		this.code = code;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}	
}
