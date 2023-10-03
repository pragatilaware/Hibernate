package com.myfirstpro.first_project;

import javax.persistence.Embeddable;

@Embeddable
public class certificate {
	
	private  String couser;
	private String course_type;
	
	public certificate(String couser, String course_type) {
		super();
		this.couser = couser;
		this.course_type = course_type;
	}
	public certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCouser() {
		return couser;
	}
	public void setCouser(String couser) {
		this.couser = couser;
	}
	public String getCourse_type() {
		return course_type;
	}
	public void setCourse_type(String course_type) {
		this.course_type = course_type;
	}
	

}
