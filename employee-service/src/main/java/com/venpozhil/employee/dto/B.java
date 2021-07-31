package com.venpozhil.employee.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class B {

	@XmlElement
	private String s1;
	
	@XmlElement
	private String s2;
	
	@XmlElement
	private String s3;
	
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	
	public String getS3() {
		return s3;
	}
	public void setS3(String s3) {
		this.s3 = s3;
	}
	
	public B() {
		super();
		this.s1 = "";
		this.s2 = "";
		this.s3 = "";
	}
	
	
}
