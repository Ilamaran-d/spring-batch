package com.venpozhil.employee.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class A extends B{

	@XmlElement
	private String s1;
	
	@XmlElement
	private String s2;
	
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	
	
	public A(String s1, String s2) {
		this.s1 = s1;
		this.setS2(s2);
		this.setS3("New Value");
	}
	
	@Override
	public String toString() {
		return "A [s1=" + s1 + ", s2=" + getS2()+ ", s3= "+ this.getS3() + "]";
	}
	
	
}
