package com.myfirstpro.first_project;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Embeddable
public class student {
	@Id
	private int id;
	
	private String stdName;
	
	private String stdSurname;
	public student(int id, String stdName, String stdSurname) {
		super();
		this.id = id;
		this.stdName = stdName;
		this.stdSurname = stdSurname;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdSurname() {
		return stdSurname;
	}
	public void setStdSurname(String stdSurname) {
		this.stdSurname = stdSurname;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+":"+this.stdName+": "+this.stdSurname;
	}
	
	
	

}
